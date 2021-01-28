package com.ms.domain.usecase.details

import com.ms.domain.repository.CharacterDetailsDataSource
import com.ms.domain.usecase.BaseUseCaseGetPlanet

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
class GetPlanetUseCase(
    private val characterDetailsDataSource: CharacterDetailsDataSource
) : BaseUseCaseGetPlanet {

    override suspend operator fun invoke(params: String) =
        characterDetailsDataSource.getCharacterPlanet(params)
}