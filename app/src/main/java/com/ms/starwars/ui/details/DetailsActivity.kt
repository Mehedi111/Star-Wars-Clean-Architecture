package com.ms.starwars.ui.details

import android.os.Bundle
import androidx.activity.viewModels
import com.ms.starwars.Constants
import com.ms.starwars.R
import com.ms.starwars.databinding.ActivityDetailsBinding
import com.ms.starwars.models.CharacterEntity
import com.ms.starwars.models.FilmEntity
import com.ms.starwars.models.PlanetEntity
import com.ms.starwars.models.SpecieEntity
import com.ms.starwars.models.states.details.FilmsViewResult
import com.ms.starwars.models.states.details.PlanetViewResult
import com.ms.starwars.models.states.details.SpeciesViewResult
import com.ms.starwars.ui.adapters.FilmAdapter
import com.ms.starwars.ui.adapters.SpeciesAdapter
import com.ms.starwars.ui.base.BaseActivity
import com.ms.starwars.utils.ext.addSnapHelper
import com.ms.starwars.utils.ext.hide
import com.ms.starwars.utils.ext.readHTML
import com.ms.starwars.utils.ext.show
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
internal class DetailsActivity : BaseActivity() {

    private lateinit var binding: ActivityDetailsBinding
    private val viewModel: DetailsViewModel by viewModels()

    @Inject
    lateinit var speciesAdapter: SpeciesAdapter

    @Inject
    lateinit var filmAdapter: FilmAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getCharacterParcel()

        observePlanetDetails()
        observeSpeciesDetails()
        observeFilmsDetails()
    }

    /**
     * get parcelable character object
     * and subscribed network change observer
     * and pass character details url to get character details
     */
    private fun getCharacterParcel() {
        val character =
            intent.getParcelableExtra<CharacterEntity>(Constants.PARCEL_KEY_CHAR)
        character?.let {
            updateCharacterBasicInfo(it)
            observeNetworkChanges(it.url)
            requestCharacterDetails(it.url)
        } ?: showSnackBar(binding.root, getString(R.string.error_loading_character_details))
    }

    /**
     * @param characterEntity is parcel object from [com.ms.starwars.ui.home.HomeActivity]
     */
    private fun updateCharacterBasicInfo(characterEntity: CharacterEntity?) {
        characterEntity?.let { character ->
            binding.headerTitle.text = getString(R.string.text_profile, character.name).readHTML()
            with(binding.profileView) {
                nameTv.text = getString(R.string.text_name, character.name).readHTML()
                birthYearTv.text =
                    getString(R.string.text_birth_year, character.birthYear).readHTML()
                heightTv.text = getString(
                    R.string.text_height,
                    character.heightInCm,
                    character.heightInFtInches
                ).readHTML()

            }
        }
    }


    /**
     * subscribe network change observer
     * @param url character details url
     * if network is connected and viewResult is in an error sate then retry to get character details
     */
    private fun observeNetworkChanges(url: String) {
        onNetworkChange { isConnected ->
            viewModel.planetDetailViewResult.value?.let { viewResult ->
                if (isConnected && viewResult is PlanetViewResult.Error) {
                    viewModel.getPlanetDetails(url)
                }
            }

            viewModel.speciesDetailViewResult.value?.let { viewResult ->
                if (isConnected && viewResult is SpeciesViewResult.Error) {
                    viewModel.getSpeciesDetails(url)
                }
            }

            viewModel.filmsDetailViewResult.value?.let { viewResult ->
                if (isConnected && viewResult is FilmsViewResult.Error) {
                    viewModel.getFilmsDetails(url)
                }
            }
        }
    }

    /**
     * @param url is the character details url, pass to get individual details
     */
    private fun requestCharacterDetails(url: String) {
        viewModel.getPlanetDetails(url)
        viewModel.getSpeciesDetails(url)
        viewModel.getFilmsDetails(url)
    }

    /**
     * subscribe planet details observer
     */
    private fun observePlanetDetails() {
        viewModel.planetDetailViewResult.observe(this, { planetViewResult ->
            when (planetViewResult) {
                is PlanetViewResult.Loading -> {
                    //show progress
                    handlePlanetLoadingView()
                }
                is PlanetViewResult.Success -> {
                    //Got response, update views
                    updatePlanetView(planetViewResult.data)
                }
                is PlanetViewResult.Error -> {
                    // show error message
                    handlePlanetErrorView(getString(planetViewResult.message))
                }
            }
        })
    }

    /**
     * update planet details views at loading state
     */
    private fun handlePlanetLoadingView() {
        binding.planetDetailsView.progressBar.show()
        binding.planetDetailsView.emptyPlanetTv.hide()
    }

    /**
     * update planet views if get error response
     */
    private fun handlePlanetErrorView(message: String) {
        binding.planetDetailsView.progressBar.hide()
        binding.planetDetailsView.planetDetailsParent.hide()
        binding.planetDetailsView.emptyPlanetTv.show()
        showSnackBar(binding.root, message)
    }

    /**
     * subscribe species details observer
     */
    private fun observeSpeciesDetails() {
        viewModel.speciesDetailViewResult.observe(this, { speciesViewResult ->
            when (speciesViewResult) {
                is SpeciesViewResult.Loading -> {
                    //show progress
                    handleSpeciesLoadingView()
                }
                is SpeciesViewResult.Success -> {
                    //Got response, update views
                    updateSpeciesView(speciesViewResult.data)

                }
                is SpeciesViewResult.Error -> {
                    // show error message
                    handleSpeciesErrorView(getString(speciesViewResult.message))
                }
            }
        })
    }

    /**
     * update species details views at loading state
     */
    private fun handleSpeciesLoadingView() {
        binding.speciesDetailsView.progressBar.show()
        binding.speciesDetailsView.emptySpecieTv.hide()
    }

    /**
     * update species views if get error response
     */
    private fun handleSpeciesErrorView(message: String) {
        binding.speciesDetailsView.progressBar.hide()
        binding.speciesDetailsView.speciesRv.hide()
        binding.speciesDetailsView.emptySpecieTv.show()
        showSnackBar(binding.root, message)
    }

    /**
     * subscribe films details observer
     */
    private fun observeFilmsDetails() {
        viewModel.filmsDetailViewResult.observe(this, { filmViewResult ->
            when (filmViewResult) {
                is FilmsViewResult.Loading -> {
                    //Got response, update views
                    handleFilmLoadingView()
                }
                is FilmsViewResult.Success -> {
                    //Got response, update views
                    updateFilmsView(filmViewResult.data)

                }
                is FilmsViewResult.Error -> {
                    // show error message
                    handleFilmsErrorView(getString(filmViewResult.message))

                }
                is FilmsViewResult.IsCompleted -> {
                    //planet details load completed
                    handleFilmsLoadCompletedView()
                }
            }
        })
    }


    /**
     * update film details views at loading state
     */
    private fun handleFilmLoadingView() {
        binding.filmDetailsView.progressBar.show()
        binding.filmDetailsView.emptyFilmsTv.hide()
    }

    /**
     * update film views if get error response
     */
    private fun handleFilmsErrorView(message: String) {
        binding.filmDetailsView.progressBar.hide()
        binding.filmDetailsView.filmsRv.hide()
        binding.filmDetailsView.emptyFilmsTv.show()
        binding.filmProgressBar.hide()
        showSnackBar(binding.root, message)
    }

    /**
     * hide mini progress after getting all film content
     */
    private fun handleFilmsLoadCompletedView() {
        binding.filmProgressBar.hide()
    }


    /**
     * update planet views after getting success response
     * @param planet details of character
     */
    private fun updatePlanetView(planet: PlanetEntity?) {
        planet?.let { planetObj ->
            binding.planetDetailsView.progressBar.hide()
            binding.planetDetailsView.planetDetailsParent.show()
            with(binding.planetDetailsView) {
                planetNameTv.text = getString(R.string.text_name, planetObj.name).readHTML()
                planetPopulationTv.text =
                    getString(R.string.text_population, planetObj.population).readHTML()
            }
        }
    }

    /**
     * update films views after getting each film details
     * @param films details list of character
     */
    private fun updateFilmsView(films: List<FilmEntity>?) {
        films?.let { list ->
            binding.filmDetailsView.progressBar.hide()
            binding.filmProgressBar.show()
            if (films.isNotEmpty()) {

                //After getting new list submit to adapter
                filmAdapter.submitList(list)

                binding.filmDetailsView.filmsRv.apply {
                    //No need to set the adapter if already set
                    if (adapter == null) {
                        adapter = filmAdapter
                        setHasFixedSize(true)
                        addSnapHelper()
                    }

                }
                binding.filmDetailsView.filmsRv.show()

            } else binding.filmDetailsView.emptyFilmsTv.show()
        }
    }

    /**
     * update species views after getting species details
     * @param species details list of character
     */
    private fun updateSpeciesView(species: List<SpecieEntity>?) {
        species?.let { list ->
            binding.speciesDetailsView.progressBar.hide()
            if (list.isNotEmpty()) {
                speciesAdapter.submitList(list)

                binding.speciesDetailsView.speciesRv.apply {
                    adapter = speciesAdapter
                }
                binding.speciesDetailsView.speciesRv.show()

            } else binding.speciesDetailsView.emptySpecieTv.show()
        }
    }
}