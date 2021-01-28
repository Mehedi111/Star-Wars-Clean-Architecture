package com.ms.starwars.di.module

import com.ms.domain.repository.CharacterDetailsDataSource
import com.ms.domain.repository.CharacterSearchDataSource
import com.ms.domain.usecase.BaseUseCaseGetFilm
import com.ms.domain.usecase.BaseUseCaseGetPlanet
import com.ms.domain.usecase.BaseUseCaseGetSpecies
import com.ms.domain.usecase.BaseUseCaseSearchCharacter
import com.ms.domain.usecase.details.GetFilmsUseCase
import com.ms.domain.usecase.details.GetPlanetUseCase
import com.ms.domain.usecase.details.GetSpeciesUseCase
import com.ms.domain.usecase.search.SearchCharacterUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton


/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
@Module
@InstallIn(ApplicationComponent::class)
object UseCaseModule {

    @Singleton
    @Provides
    fun provideSearchUseCase(characterSearchDataSource: CharacterSearchDataSource): BaseUseCaseSearchCharacter =
        SearchCharacterUseCase(characterSearchDataSource)

    @Singleton
    @Provides
    fun providePlanetUseCase(characterDetailsDataSource: CharacterDetailsDataSource): BaseUseCaseGetPlanet =
        GetPlanetUseCase(characterDetailsDataSource)

    @Singleton
    @Provides
    fun provideSpecieUseCase(characterDetailsDataSource: CharacterDetailsDataSource): BaseUseCaseGetSpecies =
        GetSpeciesUseCase(characterDetailsDataSource)

    @Singleton
    @Provides
    fun provideFilmUseCase(characterDetailsDataSource: CharacterDetailsDataSource): BaseUseCaseGetFilm =
        GetFilmsUseCase(characterDetailsDataSource)

}