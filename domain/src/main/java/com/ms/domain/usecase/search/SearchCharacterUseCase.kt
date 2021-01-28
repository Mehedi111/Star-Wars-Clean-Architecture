package com.ms.domain.usecase.search

import com.ms.domain.repository.CharacterSearchDataSource
import com.ms.domain.usecase.BaseUseCaseSearchCharacter

/**
 * Created by Mehedi Hasan on 1/16/2021.
 */
class SearchCharacterUseCase(
    private val searchDataSource: CharacterSearchDataSource
) : BaseUseCaseSearchCharacter {
    override suspend operator fun invoke(params: String) = searchDataSource.searchCharacters(params)
}