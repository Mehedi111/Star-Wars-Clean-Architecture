package com.ms.data.repository

import com.google.common.truth.Truth
import com.ms.data.utils.Constants
import com.ms.data.utils.RequestDispatcher
import com.ms.data.utils.getTestApiService
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test

class CharacterDetailsRepositoryTest {
    private lateinit var mockWebServer: MockWebServer
    private lateinit var characterDetailsRepository: CharacterDetailsRepository

    @Before
    fun setup() {
        mockWebServer = MockWebServer()
        mockWebServer.dispatcher = RequestDispatcher()
        mockWebServer.start()
        characterDetailsRepository =
            CharacterDetailsRepository(getTestApiService(mockWebServer))
    }

    /**
     * planet test start
     */
    @Test
    fun `check getCharacterPlanet returns planet details`() = runBlocking {
        val result = characterDetailsRepository.getCharacterPlanet(Constants.CHARACTER_URL)

        result.collect { planet ->
            Truth.assertThat(planet.name).isEqualTo("Kashyyyk")
            Truth.assertThat(planet.population).isEqualTo("45000000")
        }
    }

    /**
     * planet test end
     */


    /**
     * species test start
     */
    @Test
    fun `check getCharacterSpecies returns a list of species details`() =
        runBlocking {
            val result =
                characterDetailsRepository.getCharacterSpecies(Constants.CHARACTER_URL)

            result.collect { species ->
                Truth.assertThat(species).isNotEmpty()
            }
        }


    @Test
    fun `check getCharacterSpecies returns correct data`() =
        runBlocking {
            val result =
                characterDetailsRepository.getCharacterSpecies(Constants.CHARACTER_URL)

            result.collect { species ->
                val item = species.first()
                Truth.assertThat(item.name).isEqualTo("Wookie")
                Truth.assertThat(item.language).isEqualTo("Shyriiwook")
                Truth.assertThat(item.homeWorldName).isEqualTo("Kashyyyk")
            }
        }

    @Test
    fun `check getCharacterSpecies returns an empty list if species are unavailable`() = runBlocking {
        val result =
            characterDetailsRepository.getCharacterSpecies(Constants.CHARACTER_URL_EMPTY_SPECIES)

        result.collect { species ->
            Truth.assertThat(species).isEmpty()
        }
    }
    /**
     * Species test end
     */

    /**
     * Films test start
     */
    @Test
    fun `check getCharacterFilms returns a list of films details`() =
        runBlocking {
            val result =
                characterDetailsRepository.getCharacterFilms(Constants.CHARACTER_URL)

            result.collect { films ->
                Truth.assertThat(films).isNotEmpty()
            }
        }


    @Test
    fun `check getCharacterFilms returns correct data`() =
        runBlocking {
            val result =
                characterDetailsRepository.getCharacterFilms(Constants.CHARACTER_URL)

            result.collect { films ->
                Truth.assertThat(films).isNotEmpty()
                Truth.assertThat(films.first().characterList).isNotNull()
                Truth.assertThat(films.first().characterList?.first()).isEqualTo("Chewbacca")
            }
        }

    /**
     * Films test end
     */

    @After
    fun tearDown() {
        mockWebServer.shutdown()
    }
}