package com.ms.data.utils

import com.ms.data.utils.Constants.CHARACTER_URL_EMPTY_SPECIES
import com.ms.data.utils.Constants.FILMS_URL
import com.ms.data.utils.Constants.NO_MATCH_CHARACTER_URL
import com.ms.data.utils.Constants.NO_MATCH_SEARCH_QUERY
import com.ms.data.utils.Constants.PLANET_URL
import com.ms.data.utils.Constants.REQUEST_PATH
import com.ms.data.utils.Constants.SPECIES_URL
import com.ms.data.utils.Constants.CHARACTER_URL
import com.ms.data.utils.Constants.SEARCH_QUERY
import okhttp3.mockwebserver.Dispatcher
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.RecordedRequest
import java.net.HttpURLConnection

class RequestDispatcher : Dispatcher() {
    override fun dispatch(request: RecordedRequest): MockResponse {
        return when (request.path) {
            "$REQUEST_PATH?search=$SEARCH_QUERY" -> {
                MockResponse()
                    .setResponseCode(HttpURLConnection.HTTP_OK)
                    .setBody(getJson("json/character_search.json"))
            }

            "$REQUEST_PATH?search=$NO_MATCH_SEARCH_QUERY" -> {
                MockResponse()
                    .setResponseCode(HttpURLConnection.HTTP_OK)
                    .setBody(getJson("json/character_search_no_match.json"))
            }
            CHARACTER_URL -> {
                MockResponse()
                    .setResponseCode(HttpURLConnection.HTTP_OK)
                    .setBody(getJson("json/character_details.json"))
            }

            CHARACTER_URL_EMPTY_SPECIES -> {
                MockResponse()
                    .setResponseCode(HttpURLConnection.HTTP_OK)
                    .setBody(getJson("json/character_details_empty_species.json"))
            }

            NO_MATCH_CHARACTER_URL -> {
                MockResponse()
                    .setResponseCode(HttpURLConnection.HTTP_OK)
                    .setBody(getJson("json/not_found.json"))
            }

            PLANET_URL -> {
                MockResponse()
                    .setResponseCode(HttpURLConnection.HTTP_OK)
                    .setBody(getJson("json/character_planet.json"))
            }

            SPECIES_URL -> {
                MockResponse()
                    .setResponseCode(HttpURLConnection.HTTP_OK)
                    .setBody(getJson("json/characters_species.json"))
            }

            FILMS_URL -> {
                MockResponse()
                    .setResponseCode(HttpURLConnection.HTTP_OK)
                    .setBody(getJson("json/character_films.json"))
            }


            else -> throw IllegalArgumentException("Unknown Request Path ${request.path.toString()}")
        }
    }
}