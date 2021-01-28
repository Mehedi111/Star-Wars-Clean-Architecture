package com.ms.starwars.di.module

import com.ms.starwars.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object UrlProviderModule {

    @Provides
    @Singleton
    @Named("baseUrl")
    fun provideUrl(): String = Constants.BASE_URL
}