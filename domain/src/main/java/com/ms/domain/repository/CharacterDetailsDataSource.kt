package com.ms.domain.repository

import com.ms.domain.models.Film
import com.ms.domain.models.Planet
import com.ms.domain.models.Specie
import kotlinx.coroutines.flow.Flow

/**
 * Created by Mehedi Hasan on 1/16/2021.
 */
interface CharacterDetailsDataSource {

    suspend fun getCharacterPlanet(characterUrl: String): Flow<Planet>

    suspend fun getCharacterSpecies(characterUrl: String): Flow<List<Specie>>

    suspend fun getCharacterFilms(characterUrl: String): Flow<List<Film>>
}