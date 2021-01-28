package com.ms.starwars.di.module

import com.ms.data.api.ApiService
import com.ms.data.repository.CharacterDetailsRepository
import com.ms.data.repository.CharacterSearchRepository
import com.ms.domain.repository.CharacterDetailsDataSource
import com.ms.domain.repository.CharacterSearchDataSource
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
object DataSourceModule {

    @Singleton
    @Provides
    fun provideCharacterSearchRepo(apiService: ApiService): CharacterSearchDataSource {
        return CharacterSearchRepository(apiService)
    }

    @Singleton
    @Provides
    fun provideCharacterDetailsRepo(apiService: ApiService): CharacterDetailsDataSource {
        return CharacterDetailsRepository(apiService)
    }
}