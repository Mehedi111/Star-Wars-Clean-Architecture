package com.ms.domain.repository

import com.ms.domain.models.Character
import kotlinx.coroutines.flow.Flow

/**
 * Created by Mehedi Hasan on 1/16/2021.
 */
interface CharacterSearchDataSource {
    suspend fun searchCharacters(characterName: String): Flow<List<Character>>
}