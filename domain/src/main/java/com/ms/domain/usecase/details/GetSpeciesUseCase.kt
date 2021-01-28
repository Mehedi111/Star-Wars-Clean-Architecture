package com.ms.domain.usecase.details

import com.ms.domain.repository.CharacterDetailsDataSource
import com.ms.domain.usecase.BaseUseCaseGetSpecies

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
class GetSpeciesUseCase(
    private val characterDetailsDataSource: CharacterDetailsDataSource
) : BaseUseCaseGetSpecies {

    override suspend operator fun invoke(params: String) =
        characterDetailsDataSource.getCharacterSpecies(params)
}