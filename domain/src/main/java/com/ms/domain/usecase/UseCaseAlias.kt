package com.ms.domain.usecase

import com.ms.domain.models.Character
import com.ms.domain.models.Film
import com.ms.domain.models.Planet
import com.ms.domain.models.Specie
import kotlinx.coroutines.flow.Flow

/**
 * Created by Mehedi Hasan on 1/21/2021.
 */
typealias BaseUseCaseSearchCharacter = @JvmSuppressWildcards BaseUseCase<String, Flow<List<Character>>>

typealias BaseUseCaseGetPlanet = @JvmSuppressWildcards BaseUseCase<String, Flow<Planet>>

typealias BaseUseCaseGetSpecies = @JvmSuppressWildcards BaseUseCase<String, Flow<List<Specie>>>

typealias BaseUseCaseGetFilm = @JvmSuppressWildcards BaseUseCase<String, Flow<List<Film>>>


