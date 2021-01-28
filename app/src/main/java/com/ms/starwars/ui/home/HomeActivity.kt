package com.ms.starwars.ui.home

import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.widget.doOnTextChanged
import com.ms.starwars.databinding.ActivityHomeBinding
import com.ms.starwars.models.CharacterEntity
import com.ms.starwars.models.states.SearchViewResult
import com.ms.starwars.ui.adapters.SearchedCharacterAdapter
import com.ms.starwars.ui.base.BaseActivity
import com.ms.starwars.utils.ext.hide
import com.ms.starwars.utils.ext.show
import com.ms.starwars.utils.idlingResource.EspressoIdlingResource
import dagger.hilt.android.AndroidEntryPoint
import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter
import javax.inject.Inject

@AndroidEntryPoint
internal class HomeActivity : BaseActivity() {

    private lateinit var binding: ActivityHomeBinding
    private val viewModel: HomeViewModel by viewModels()

    @Inject
    lateinit var searchedCharacterAdapter: SearchedCharacterAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startEdTransitionOnClick()
        handleSearchView()
        observeSearchResult()
    }

    /**
     * start transition at the first click on search edit text
     */
    private fun startEdTransitionOnClick() {
        binding.searchEditText.setOnFocusChangeListener { _, _ ->
            binding.layoutParent.transitionToEnd()
        }
    }

    /**
     * handle user query from search edit text
     * doOnTextChanged will be invoked when text is changing
     */
    private fun handleSearchView() {
        binding.searchEditText.doOnTextChanged { text, _, _, _ ->
            text?.let { query ->
                if (query.isNotEmpty() && query.length >= 2) {
                    // if query length is more than 2 then request api.
                    viewModel.searchCharacter(query.toString())
                }
            }

        }
    }

    /**
     * subscribed observer to observe search result
     */
    private fun observeSearchResult() {
        viewModel.searchViewResult.observe(this, { viewResult ->
            when (viewResult) {
                is SearchViewResult.Loading -> {
                    //show progress
                    handleLoadingView()
                }
                is SearchViewResult.Success -> {
                    //Got response, update views
                    handleSearchResults(viewResult.data)

                    //if result is empty then show no result view
                    if (viewResult.data.isNotEmpty()) {
                        handleSearchResultView()
                    } else handleNoSearchResultsView()
                }
                is SearchViewResult.Error -> {
                    // show error message
                    handleErrorView(getString(viewResult.message))
                }
            }
        })

    }

    /**
     * update views as per search result from api
     * @param searchResults is the api response according to user query
     */
    private fun handleSearchResults(searchResults: List<CharacterEntity>) {
        EspressoIdlingResource.decrement()
        //searchedCharacterAdapter.
        binding.searchResultRv.apply {
            adapter = AlphaInAnimationAdapter(searchedCharacterAdapter.apply {
                submitList(searchResults)

                setOnItemClickListener {
                    moveToDetails(it)
                }
            })
        }
        //if result is empty then show no result view
        if (searchResults.isNotEmpty()) {
            handleSearchResultView()
        } else handleNoSearchResultsView()
    }

    /**
     * update views after getting search result
     */
    private fun handleSearchResultView() {
        EspressoIdlingResource.decrement()
        binding.emptyLayout.hide()
        binding.progressBar.hide()
        binding.searchResultRv.show()
    }


    /**
     * update views at loading state
     */
    private fun handleLoadingView() {
        EspressoIdlingResource.decrement()
        binding.searchResultRv.hide()
        binding.progressBar.show()
        binding.emptyLayout.hide()
    }

    /**
     * update views if no matching character found
     */
    private fun handleNoSearchResultsView() {
        EspressoIdlingResource.decrement()
        binding.emptyLayout.show()
        binding.progressBar.hide()
        binding.searchResultRv.hide()
    }

    /**
     * update views if get error response
     */
    private fun handleErrorView(message: String) {
        EspressoIdlingResource.decrement()

        binding.emptyLayout.show()
        binding.progressBar.hide()
        binding.searchResultRv.hide()

        showSnackBar(binding.root, message)
    }

}



