package com.ms.data.repository

import com.google.common.truth.Truth
import com.ms.data.utils.Constants.NO_MATCH_SEARCH_QUERY
import com.ms.data.utils.Constants.SEARCH_QUERY
import com.ms.data.utils.RequestDispatcher
import com.ms.data.utils.getTestApiService
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test

class CharacterSearchRepositoryTest {

    private lateinit var mockWebServer: MockWebServer
    private lateinit var characterSearchRepository: CharacterSearchRepository

    @Before
    fun setup() {
        mockWebServer = MockWebServer()
        mockWebServer.dispatcher = RequestDispatcher()
        mockWebServer.start()
        characterSearchRepository = CharacterSearchRepository(getTestApiService(mockWebServer))
    }


    @Test
    fun `valid search query returns a list of search result`() = runBlocking {
        val result = characterSearchRepository.searchCharacters(SEARCH_QUERY)

        result.collect { characters ->
            Truth.assertThat(characters).isNotEmpty()
            Truth.assertThat(characters.size).isEqualTo(3)
        }
    }

    @Test
    fun `valid search query returns correct data`() = runBlocking {
        val result = characterSearchRepository.searchCharacters(SEARCH_QUERY)

        result.collect { characters ->
            val firstItem = characters.first()
            val lastItem = characters.last()
            Truth.assertThat(firstItem.name).isEqualTo("Wedge Antilles")
            Truth.assertThat(firstItem.birthYear).isEqualTo("21BBY")
            Truth.assertThat(firstItem.height).isEqualTo("170")

            Truth.assertThat(lastItem.name).isEqualTo("Raymus Antilles")
            Truth.assertThat(lastItem.birthYear).isEqualTo("unknown")
            Truth.assertThat(lastItem.height).isEqualTo("188")
        }
    }


    @Test
    fun `non-existing search query returns an empty list`() = runBlocking {
        val result = characterSearchRepository.searchCharacters(NO_MATCH_SEARCH_QUERY)

        result.collect { characters ->
            Truth.assertThat(characters).isEmpty()
        }
    }


    @After
    fun tearDown() {
        mockWebServer.shutdown()
    }

}