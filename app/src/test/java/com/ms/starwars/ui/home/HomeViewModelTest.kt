package com.ms.starwars.ui.home

import android.os.Build
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth
import com.ms.starwars.BaseViewModelTest
import com.ms.starwars.fakeUseCases.search.FakeSearchCharacterUseCase
import com.ms.starwars.getOrAwaitValueTest
import com.ms.starwars.models.states.SearchViewResult
import com.ms.starwars.utils.State
import com.ms.starwars.utils.TestData
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(sdk = [Build.VERSION_CODES.O_MR1])
@ExperimentalCoroutinesApi
class HomeViewModelTest : BaseViewModelTest() {

    private lateinit var homeViewModel: HomeViewModel


    private fun prepareViewModel(state: State) {
        val searchCharactersUseCase = FakeSearchCharacterUseCase(state)
        homeViewModel = HomeViewModel(searchCharactersUseCase)
    }

    @Test
    fun `pass valid character name returns success state`() {

        launchBlockingTest {

            prepareViewModel(State.SUCCESS)
            homeViewModel.searchCharacter(TestData.TEST_QUERY_VALID)

            advanceTimeBy(500)

            val value = homeViewModel.searchViewResult.getOrAwaitValueTest()
            Truth.assertThat(value is SearchViewResult.Success).isTrue()
        }
    }

    @Test
    fun `pass unknown character name returns success with empty list`() {
        launchBlockingTest {
            prepareViewModel(State.SUCCESS)

            homeViewModel.searchCharacter(TestData.TEST_QUERY_UNKNOWN)

            advanceTimeBy(500)

            val value = homeViewModel.searchViewResult.getOrAwaitValueTest()
            Truth.assertThat(value is SearchViewResult.Success).isTrue()
            Truth.assertThat((value as SearchViewResult.Success).data).isEmpty()
        }

    }


    @Test
    fun `pass an invalid state returns error response`() {
        launchBlockingTest {
            prepareViewModel(State.ERROR)

            homeViewModel.searchCharacter(TestData.TEST_QUERY_EMPTY)

            advanceTimeBy(500)

            val value = homeViewModel.searchViewResult.getOrAwaitValueTest()
            Truth.assertThat(value is SearchViewResult.Success).isFalse()
            Truth.assertThat(value is SearchViewResult.Error).isTrue()
        }

    }

}