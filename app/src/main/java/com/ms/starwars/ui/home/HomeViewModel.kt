package com.ms.starwars.ui.home

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ms.domain.usecase.BaseUseCaseSearchCharacter
import com.ms.starwars.mappers.mapToEntity
import com.ms.starwars.models.states.SearchViewResult
import com.ms.starwars.ui.base.BaseViewModel
import com.ms.starwars.utils.exception.ExceptionHandler
import com.ms.starwars.utils.idlingResource.EspressoIdlingResource
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
internal class HomeViewModel @ViewModelInject constructor(
    private val searchCharactersBaseUseCase: BaseUseCaseSearchCharacter
) : BaseViewModel() {

    //declare job for handle search coroutine
    private var searchJob: Job? = null


    //search live data
    val searchViewResult: LiveData<SearchViewResult>
        get() = _searchViewResult

    private var _searchViewResult = MutableLiveData<SearchViewResult>()


    /**
     * coroutineExceptionHandler will handle uncaught exceptions.
     */
    private val coroutineExceptionHandler: CoroutineExceptionHandler =
        CoroutineExceptionHandler { _, exception ->
            val errorMsg = ExceptionHandler.parse(exception)
            EspressoIdlingResource.increment()
            _searchViewResult.value = SearchViewResult.Error(errorMsg)
        }


    /**
     * @param query is the user input
     */
    fun searchCharacter(query: String) {
        EspressoIdlingResource.increment()
        // if already has a job then cancel the old one first/
        searchJob?.cancel()
        searchJob = launchCoroutine(coroutineExceptionHandler) {
            // make a delay 500MS after every api request
            delay(500)
            EspressoIdlingResource.increment()
            _searchViewResult.value = SearchViewResult.Loading

            searchCharactersBaseUseCase(query).collect { characterList ->
                val characters = characterList.map { character ->
                    //map each character item to character entity
                    character.mapToEntity()
                }

                EspressoIdlingResource.increment()
                //after getting response post result.
                _searchViewResult.value = SearchViewResult.Success(characters)

            }
        }
    }


    override fun onCleared() {
        //clear job to avoid memory leaks
        searchJob?.cancel()
        super.onCleared()
    }

}