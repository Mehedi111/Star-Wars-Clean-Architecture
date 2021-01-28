package com.ms.data.mappers

import com.google.common.truth.Truth
import com.ms.data.DummyData
import org.junit.Test

class MapJsonToDomainTest {

    @Test
    fun `check characterResponse mapToDomain returns character object`() {
        val characterResponse = DummyData.characterResponse
        val character = characterResponse.mapToDomain()
        Truth.assertThat(characterResponse.name).isEqualTo(character.name)
        Truth.assertThat(characterResponse.birthYear).isEqualTo(character.birthYear)
    }

    @Test
    fun `check planetDetailsResponse mapToDomain returns planet object`() {
        val planetDetailsResponse = DummyData.planetDetailsResponse
        val planet = planetDetailsResponse.mapToDomain()
        Truth.assertThat(planetDetailsResponse.name).isEqualTo(planet.name)
        Truth.assertThat(planetDetailsResponse.population).isEqualTo(planet.population)
    }

    @Test
    fun `check speciesDetailsResponse mapToDomain returns specie object`() {
        val specieDetailResponse = DummyData.specieDetailsResponse
        val specie = specieDetailResponse.mapToDomain()
        Truth.assertThat(specieDetailResponse.name).isEqualTo(specie.name)
        Truth.assertThat(specieDetailResponse.language).isEqualTo(specie.language)
    }

    @Test
    fun `check filmsDetailsResponse mapToDomain returns film object`() {
        val filmDetailsResponse = DummyData.filmDetailsResponse
        val film = filmDetailsResponse.mapToDomain()
        Truth.assertThat(filmDetailsResponse.title).isEqualTo(film.title)
        Truth.assertThat(filmDetailsResponse.openingCrawl).isEqualTo(film.openingCrawl)
    }
}