package com.ms.starwars.fakeUseCases.details

import com.ms.domain.models.Film
import com.ms.domain.usecase.BaseUseCaseGetFilm
import com.ms.starwars.fakeUseCases.FilmBaseTestUseCase
import com.ms.starwars.utils.State
import com.ms.starwars.utils.TestData
import kotlinx.coroutines.flow.Flow


class FakeGetFilmsUseCase(type: State) : BaseUseCaseGetFilm, FilmBaseTestUseCase(type) {

    override suspend fun invoke(params: String): Flow<List<Film>> = execute(params)

    override fun getValue(params: String): List<Film> =
        if (params == TestData.TEST_CHARACTER_URL) TestData.TEST_RESULT_FILM
        else emptyList()

}