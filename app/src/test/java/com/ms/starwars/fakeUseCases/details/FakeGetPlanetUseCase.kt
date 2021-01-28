package com.ms.starwars.fakeUseCases.details

import com.ms.domain.models.Planet
import com.ms.domain.usecase.BaseUseCaseGetPlanet
import com.ms.starwars.fakeUseCases.PlanetBaseTestUseCase
import com.ms.starwars.utils.State
import com.ms.starwars.utils.TestData
import kotlinx.coroutines.flow.Flow


class FakeGetPlanetUseCase(type: State) : BaseUseCaseGetPlanet, PlanetBaseTestUseCase(type) {

    override suspend fun invoke(params: String): Flow<Planet> = execute(params)

    override fun getValue(params: String): Planet =
        if (params == TestData.TEST_CHARACTER_URL) TestData.TEST_RESULT_PLANET
        else throw IllegalStateException()

}