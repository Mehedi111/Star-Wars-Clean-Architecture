package com.ms.starwars.utils

import com.ms.domain.models.Character
import com.ms.domain.models.Film
import com.ms.domain.models.Planet
import com.ms.domain.models.Specie

object TestData {
    const val TEST_QUERY_VALID = "Luke"
    const val TEST_CHARACTER_URL = "http://swapi.dev/api/people/1/"

    val TEST_RESULT_FOR_VALID_QUERY = listOf(
        Character(
            name = "Luke Skywalker",
            birthYear = "19BBY",
            height = "172",
            url = "http://swapi.dev/api/people/1/"
        )
    )

    val TEST_RESULT_FILM =
        listOf(
            Film(
                title = "film title",
                openingCrawl = "description",
                characterList = listOf("Luke", "R2-D2")
            )
        )
    val TEST_RESULT_PLANET = Planet(name = "planet name", population = "100000")
    val TEST_RESULT_SPECIES = listOf(
        Specie(
            name = "specie name", language = "language", homeWorldName = "homeworld"
        )
    )

    const val TEST_QUERY_EMPTY = ""

    const val TEST_QUERY_UNKNOWN = "batman"
    val TEST_RESULT_FOR_EMPTY_QUERY = emptyList<Character>()


    val TEST_CHARACTER = Character(
        name = "Luke Skywalker",
        birthYear = "19BBY",
        height = "202",
        url = "http://swapi.dev/api/people/1/"
    )

    val TEST_FILM = Film(
        title = "film title",
        openingCrawl = "description",
        characterList = listOf("Luke", "R2-D2")
    )

}