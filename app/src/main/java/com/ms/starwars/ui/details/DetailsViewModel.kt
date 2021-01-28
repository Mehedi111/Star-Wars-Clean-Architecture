package com.ms.starwars.ui.details

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ms.domain.usecase.BaseUseCaseGetFilm
import com.ms.domain.usecase.BaseUseCaseGetPlanet
import com.ms.domain.usecase.BaseUseCaseGetSpecies
import com.ms.starwars.mappers.mapToEntity
import com.ms.starwars.models.states.details.FilmsViewResult
import com.ms.starwars.models.states.details.PlanetViewResult
import com.ms.starwars.models.states.details.SpeciesViewResult
import com.ms.starwars.ui.base.BaseViewModel
import com.ms.starwars.utils.exception.ExceptionHandler
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.withContext

internal class DetailsViewModel @ViewModelInject constructor(
    private val getSpeciesUseCase: BaseUseCaseGetSpecies,
    private val getPlanetUseCase: BaseUseCaseGetPlanet,
    private val getFilmsUseCase: BaseUseCaseGetFilm

) : BaseViewModel() {

    // Get character Planet details
    private var planetDetailsJob: Job? = null

    val planetDetailViewResult: LiveData<PlanetViewResult>
        get() = _planetDetailViewResult

    private var _planetDetailViewResult = MutableLiveData<PlanetViewResult>()

    /**
     * planet details uncaught exceptions handler
     */
    private val planetDetailsCoroutineExceptionHandler: CoroutineExceptionHandler =
        CoroutineExceptionHandler { _, throwable ->
            val message = ExceptionHandler.parse(throwable)
            _planetDetailViewResult.value = PlanetViewResult.Error(message)
        }


    fun getPlanetDetails(characterUrl: String) {
        _planetDetailViewResult.value = PlanetViewResult.Loading
        planetDetailsJob = launchCoroutine(planetDetailsCoroutineExceptionHandler) {
            withContext(Dispatchers.Main) { loadPlanet(characterUrl) }
        }
    }

    private suspend fun loadPlanet(characterUrl: String) {
        getPlanetUseCase(characterUrl).collect { planet ->
            val planetItem = planet.mapToEntity()
            _planetDetailViewResult.value = PlanetViewResult.Success(planetItem)
        }
    }


    // Get character Species details
    private var speciesDetailsJob: Job? = null

    val speciesDetailViewResult: LiveData<SpeciesViewResult>
        get() = _speciesDetailViewResult

    private var _speciesDetailViewResult = MutableLiveData<SpeciesViewResult>()

    /**
     * species details uncaught exceptions handler
     */
    private val speciesDetailsCoroutineExceptionHandler: CoroutineExceptionHandler =
        CoroutineExceptionHandler { _, throwable ->
            val message = ExceptionHandler.parse(throwable)
            _speciesDetailViewResult.value = SpeciesViewResult.Error(message)
        }


    fun getSpeciesDetails(characterUrl: String) {
        _speciesDetailViewResult.value = SpeciesViewResult.Loading
        speciesDetailsJob = launchCoroutine(speciesDetailsCoroutineExceptionHandler) {
            withContext(Dispatchers.Main) { loadSpecies(characterUrl) }
        }
    }

    private suspend fun loadSpecies(characterUrl: String) {
        getSpeciesUseCase(characterUrl).collect { species ->
            val specieItems = species.map {
                it.mapToEntity()
            }
            _speciesDetailViewResult.value = SpeciesViewResult.Success(specieItems)
        }
    }

    // Get character Films details
    private var filmsDetailsJob: Job? = null

    val filmsDetailViewResult: LiveData<FilmsViewResult>
        get() = _filmsDetailViewResult

    private var _filmsDetailViewResult = MutableLiveData<FilmsViewResult>()

    /**
     * films details uncaught exceptions handler
     */
    private val filmsDetailsCoroutineExceptionHandler: CoroutineExceptionHandler =
        CoroutineExceptionHandler { _, throwable ->
            val message = ExceptionHandler.parse(throwable)
            _filmsDetailViewResult.value = FilmsViewResult.Error(message)
        }


    fun getFilmsDetails(characterUrl: String) {
        _filmsDetailViewResult.value = FilmsViewResult.Loading
        filmsDetailsJob = launchCoroutine(filmsDetailsCoroutineExceptionHandler) {
            withContext(Dispatchers.Main) {
                loadFilms(
                    characterUrl
                )
            }
            //after getting all film details update to IsCompleted state
            _filmsDetailViewResult.value = FilmsViewResult.IsCompleted
        }
    }

    private suspend fun loadFilms(characterUrl: String) {
        getFilmsUseCase(characterUrl).collect { films ->
            val filmItems = films.map {
                it.mapToEntity()
            }
            _filmsDetailViewResult.value = FilmsViewResult.Success(filmItems)
        }
    }


    /**
     * cancel all job to avoid memory leaks
     */
    override fun onCleared() {
        planetDetailsJob?.cancel()
        speciesDetailsJob?.cancel()
        filmsDetailsJob?.cancel()
        super.onCleared()
    }
}