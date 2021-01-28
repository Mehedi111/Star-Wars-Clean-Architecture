package com.ms.starwars.fakeUseCases.details

import com.ms.domain.models.Specie
import com.ms.domain.usecase.BaseUseCaseGetSpecies
import com.ms.starwars.fakeUseCases.SpeciesBaseTestUseCase
import com.ms.starwars.utils.State
import com.ms.starwars.utils.TestData
import kotlinx.coroutines.flow.Flow

class FakeGetSpeciesUseCase(type: State) : BaseUseCaseGetSpecies,
    SpeciesBaseTestUseCase(type) {

    override suspend fun invoke(params: String): Flow<List<Specie>> = execute(params)

    override fun getValue(params: String): List<Specie> =
        if (params == TestData.TEST_CHARACTER_URL) TestData.TEST_RESULT_SPECIES
        else emptyList()
}