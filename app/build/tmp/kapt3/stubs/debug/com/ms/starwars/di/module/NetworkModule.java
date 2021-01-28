package com.ms.starwars.di.module;

import java.lang.System;

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\nH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/ms/starwars/di/module/NetworkModule;", "", "()V", "baseApiService", "Lcom/ms/data/api/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "baseOkHttpClient", "Lokhttp3/OkHttpClient;", "loggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "baseRetrofit", "okHttpClient", "baseUrl", "", "okHttpLoggingInterceptor", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.ms.starwars.di.module.NetworkModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.logging.HttpLoggingInterceptor okHttpLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient baseOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor loggingInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit baseRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "baseUrl")
    java.lang.String baseUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.ms.data.api.ApiService baseApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    private NetworkModule() {
        super();
    }
}