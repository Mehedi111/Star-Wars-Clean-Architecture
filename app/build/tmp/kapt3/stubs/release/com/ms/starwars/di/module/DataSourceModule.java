package com.ms.starwars.di.module;

import java.lang.System;

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/ms/starwars/di/module/DataSourceModule;", "", "()V", "provideCharacterDetailsRepo", "Lcom/ms/domain/repository/CharacterDetailsDataSource;", "apiService", "Lcom/ms/data/api/ApiService;", "provideCharacterSearchRepo", "Lcom/ms/domain/repository/CharacterSearchDataSource;", "app_release"})
@dagger.Module()
public final class DataSourceModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.ms.starwars.di.module.DataSourceModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.ms.domain.repository.CharacterSearchDataSource provideCharacterSearchRepo(@org.jetbrains.annotations.NotNull()
    com.ms.data.api.ApiService apiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.ms.domain.repository.CharacterDetailsDataSource provideCharacterDetailsRepo(@org.jetbrains.annotations.NotNull()
    com.ms.data.api.ApiService apiService) {
        return null;
    }
    
    private DataSourceModule() {
        super();
    }
}