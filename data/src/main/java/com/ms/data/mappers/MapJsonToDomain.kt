package com.ms.data.mappers

import com.ms.data.models.CharacterResponse
import com.ms.data.models.FilmDetailResponse
import com.ms.data.models.PlanetDetailsResponse
import com.ms.data.models.SpecieDetailResponse
import com.ms.domain.models.Character
import com.ms.domain.models.Film
import com.ms.domain.models.Planet
import com.ms.domain.models.Specie

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
internal fun CharacterResponse.mapToDomain(): Character {
    return Character(
        name = this.name,
        birthYear = this.birthYear,
        height = this.height,
        url = this.url
    )
}

internal fun PlanetDetailsResponse.mapToDomain(): Planet {
    return Planet(
        name = this.name,
        population = this.population
    )
}

internal fun SpecieDetailResponse.mapToDomain(): Specie {
    return Specie(
        name = this.name,
        language = this.language,
        homeWorldName = null
    )
}

internal fun FilmDetailResponse.mapToDomain(): Film {
    return Film(
        title = this.title,
        openingCrawl = this.openingCrawl,
        characterList = null
    )
}