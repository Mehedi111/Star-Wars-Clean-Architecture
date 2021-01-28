package com.ms.starwars.di.module;

import java.lang.System;

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a#\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u0004j\u0002`\t\u00a2\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J+\u0010\r\u001a\u001d\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00060\u0004j\u0002`\u000f\u00a2\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J1\u0010\u0010\u001a#\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00060\u0004j\u0002`\u0012\u00a2\u0006\u0002\b\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J1\u0010\u0015\u001a#\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\u00060\u0004j\u0002`\u0017\u00a2\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\u0018"}, d2 = {"Lcom/ms/starwars/di/module/UseCaseModule;", "", "()V", "provideFilmUseCase", "Lcom/ms/domain/usecase/BaseUseCase;", "", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/ms/domain/models/Film;", "Lcom/ms/domain/usecase/BaseUseCaseGetFilm;", "Lkotlin/jvm/JvmSuppressWildcards;", "characterDetailsDataSource", "Lcom/ms/domain/repository/CharacterDetailsDataSource;", "providePlanetUseCase", "Lcom/ms/domain/models/Planet;", "Lcom/ms/domain/usecase/BaseUseCaseGetPlanet;", "provideSearchUseCase", "Lcom/ms/domain/models/Character;", "Lcom/ms/domain/usecase/BaseUseCaseSearchCharacter;", "characterSearchDataSource", "Lcom/ms/domain/repository/CharacterSearchDataSource;", "provideSpecieUseCase", "Lcom/ms/domain/models/Specie;", "Lcom/ms/domain/usecase/BaseUseCaseGetSpecies;", "app_debug"})
@dagger.Module()
public final class UseCaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.ms.starwars.di.module.UseCaseModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.ms.domain.usecase.BaseUseCase<java.lang.String, kotlinx.coroutines.flow.Flow<java.util.List<com.ms.domain.models.Character>>> provideSearchUseCase(@org.jetbrains.annotations.NotNull()
    com.ms.domain.repository.CharacterSearchDataSource characterSearchDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.ms.domain.usecase.BaseUseCase<java.lang.String, kotlinx.coroutines.flow.Flow<com.ms.domain.models.Planet>> providePlanetUseCase(@org.jetbrains.annotations.NotNull()
    com.ms.domain.repository.CharacterDetailsDataSource characterDetailsDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.ms.domain.usecase.BaseUseCase<java.lang.String, kotlinx.coroutines.flow.Flow<java.util.List<com.ms.domain.models.Specie>>> provideSpecieUseCase(@org.jetbrains.annotations.NotNull()
    com.ms.domain.repository.CharacterDetailsDataSource characterDetailsDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.ms.domain.usecase.BaseUseCase<java.lang.String, kotlinx.coroutines.flow.Flow<java.util.List<com.ms.domain.models.Film>>> provideFilmUseCase(@org.jetbrains.annotations.NotNull()
    com.ms.domain.repository.CharacterDetailsDataSource characterDetailsDataSource) {
        return null;
    }
    
    private UseCaseModule() {
        super();
    }
}