package com.ms.domain.usecase.details

import com.ms.domain.repository.CharacterDetailsDataSource
import com.ms.domain.usecase.BaseUseCaseGetFilm


/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
class GetFilmsUseCase (
    private val characterDetailsDataSource: CharacterDetailsDataSource
) : BaseUseCaseGetFilm {
    override suspend operator fun invoke(params: String) =
        characterDetailsDataSource.getCharacterFilms(params)
}