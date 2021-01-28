package com.ms.data

import com.ms.data.models.*

object DummyData {

    val characterResponse = CharacterResponse(
        name = "character name",
        birthYear = "birth year",
        height = "height",
        url = "details url"
    )

    val planetDetailsResponse = PlanetDetailsResponse(
        name = "planet name",
        population = "20000000000"
    )

    val specieDetailsResponse = SpecieDetailResponse(
        name = "species name",
        language = "language",
        homeWorldUrl = "url"
    )

    val filmDetailsResponse = FilmDetailResponse(
        title = "title",
        openingCrawl = "description",
        characters = listOf("character")
    )
}