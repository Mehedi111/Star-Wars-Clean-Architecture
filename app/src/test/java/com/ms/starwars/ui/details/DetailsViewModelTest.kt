package com.ms.starwars.ui.details

import android.os.Build
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth
import com.ms.starwars.BaseViewModelTest
import com.ms.starwars.fakeUseCases.details.FakeGetFilmsUseCase
import com.ms.starwars.fakeUseCases.details.FakeGetPlanetUseCase
import com.ms.starwars.fakeUseCases.details.FakeGetSpeciesUseCase
import com.ms.starwars.getOrAwaitValueTest
import com.ms.starwars.models.states.details.FilmsViewResult
import com.ms.starwars.models.states.details.PlanetViewResult
import com.ms.starwars.models.states.details.SpeciesViewResult
import com.ms.starwars.utils.State
import com.ms.starwars.utils.TestData.TEST_CHARACTER_URL
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(sdk = [Build.VERSION_CODES.O_MR1])
@ExperimentalCoroutinesApi
class DetailsViewModelTest : BaseViewModelTest() {

    private lateinit var detailsViewModel: DetailsViewModel

    private fun prepareViewModel(state: State) {
        val getPlanetUseCase = FakeGetPlanetUseCase(state)
        val getSpeciesUseCase = FakeGetSpeciesUseCase(state)
        val getFilmsUseCase = FakeGetFilmsUseCase(state)
        detailsViewModel = DetailsViewModel(
            getPlanetUseCase = getPlanetUseCase, getFilmsUseCase = getFilmsUseCase,
            getSpeciesUseCase = getSpeciesUseCase
        )
    }


    @Test
    fun `pass valid characterUrl returns character details`() {
        launchBlockingTest {

            prepareViewModel(State.SUCCESS)

            //planet details test
            detailsViewModel.getPlanetDetails(TEST_CHARACTER_URL)
            val planetResult = detailsViewModel.planetDetailViewResult.getOrAwaitValueTest()
            Truth.assertThat(planetResult is PlanetViewResult.Success).isTrue()
            Truth.assertThat(planetResult is PlanetViewResult.Error).isFalse()

            //species details test
            detailsViewModel.getSpeciesDetails(TEST_CHARACTER_URL)
            val speciesResult = detailsViewModel.speciesDetailViewResult.getOrAwaitValueTest()
            Truth.assertThat(speciesResult is SpeciesViewResult.Success).isTrue()
            Truth.assertThat(speciesResult is SpeciesViewResult.Error).isFalse()

            //films details test
            detailsViewModel.getFilmsDetails(TEST_CHARACTER_URL)
            val filmsResult = detailsViewModel.filmsDetailViewResult.getOrAwaitValueTest()
            Truth.assertThat(filmsResult is FilmsViewResult.IsCompleted).isTrue() //isCompleted is last state after emitting all films .
            Truth.assertThat(filmsResult is FilmsViewResult.Error).isFalse()
        }
    }


    /**
     * passing error state to every use case to check planet, species and films error result individually
     */
    @Test
    fun `pass invalid state returns error response`() {
        launchBlockingTest {

            prepareViewModel(State.ERROR)

            //planet details error test
            detailsViewModel.getPlanetDetails(TEST_CHARACTER_URL)
            val planetResult = detailsViewModel.planetDetailViewResult.getOrAwaitValueTest()
            Truth.assertThat(planetResult is PlanetViewResult.Error).isTrue()

            //species details error test
            detailsViewModel.getSpeciesDetails(TEST_CHARACTER_URL)
            val speciesResult = detailsViewModel.speciesDetailViewResult.getOrAwaitValueTest()
            Truth.assertThat(speciesResult is SpeciesViewResult.Error).isTrue()

            //films details error test
            detailsViewModel.getFilmsDetails(TEST_CHARACTER_URL)
            val filmsResult = detailsViewModel.filmsDetailViewResult.getOrAwaitValueTest()
            Truth.assertThat(filmsResult is FilmsViewResult.Error).isTrue()
        }
    }

}