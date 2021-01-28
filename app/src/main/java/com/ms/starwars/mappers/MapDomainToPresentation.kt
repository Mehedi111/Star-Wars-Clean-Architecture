package com.ms.starwars.mappers

import com.ms.domain.models.Character
import com.ms.domain.models.Film
import com.ms.domain.models.Planet
import com.ms.domain.models.Specie
import com.ms.starwars.models.CharacterEntity
import com.ms.starwars.models.FilmEntity
import com.ms.starwars.models.PlanetEntity
import com.ms.starwars.models.SpecieEntity
import com.ms.starwars.utils.convertToFeetInches

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
internal fun Character.mapToEntity(): CharacterEntity {
    return CharacterEntity(
        name = this.name,
        birthYear = this.birthYear,
        heightInCm = this.height,
        heightInFtInches = convertToFeetInches(this.height),
        url = this.url
    )
}

internal fun Planet.mapToEntity(): PlanetEntity {
    return PlanetEntity(
        name = this.name,
        population = this.population
    )
}

internal fun Specie.mapToEntity(): SpecieEntity {
    return SpecieEntity(
        name = this.name,
        language = this.language,
        homeWorld = this.homeWorldName ?: "Unknown"
    )
}

internal fun Film.mapToEntity(): FilmEntity {
    return FilmEntity(
        title = this.title,
        openingCrawl = this.openingCrawl,
        characters = this.characterList ?: listOf()
    )
}