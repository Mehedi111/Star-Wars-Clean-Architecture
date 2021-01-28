package com.ms.starwars.fakeUseCases.search

import com.ms.domain.models.Character
import com.ms.domain.usecase.BaseUseCaseSearchCharacter
import com.ms.starwars.fakeUseCases.SearchBaseTestUseCase
import com.ms.starwars.utils.State
import com.ms.starwars.utils.TestData
import kotlinx.coroutines.flow.Flow

class FakeSearchCharacterUseCase(
    type: State
) : BaseUseCaseSearchCharacter, SearchBaseTestUseCase(type) {

    override suspend fun invoke(params: String): Flow<List<Character>> = execute(params)

    override fun getValue(params: String): List<Character> =
        if (params == TestData.TEST_QUERY_VALID) TestData.TEST_RESULT_FOR_VALID_QUERY
        else TestData.TEST_RESULT_FOR_EMPTY_QUERY
}