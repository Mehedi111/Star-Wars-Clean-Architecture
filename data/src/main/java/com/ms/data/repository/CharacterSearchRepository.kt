package com.ms.data.repository

import com.ms.data.api.ApiService
import com.ms.data.mappers.mapToDomain
import com.ms.domain.models.Character
import com.ms.domain.repository.CharacterSearchDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
class CharacterSearchRepository(
    private val apiService: ApiService
) : CharacterSearchDataSource {

    /**
     * get character list as per user query
     * @param characterName user query
     */
    override suspend fun searchCharacters(characterName: String): Flow<List<Character>> = flow {
        val searchResponse = apiService.searchCharacters(characterName)
        val characters = mutableListOf<Character>()
        for (character in searchResponse.results) {
            characters.add(character.mapToDomain())
        }
        emit(characters)
    }
}