package com.ms.starwars.di.module

import com.ms.data.api.ApiService
import com.ms.data.interceptor.HttpsInterceptor
import com.ms.starwars.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
@Module
@InstallIn(ApplicationComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun okHttpLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    @Singleton
    @Provides
    fun baseOkHttpClient(
        loggingInterceptor: HttpLoggingInterceptor,
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(HttpsInterceptor)
            .addInterceptor(loggingInterceptor)
            .readTimeout(Constants.HTTP_READ_TIMEOUT, TimeUnit.SECONDS)
            .connectTimeout(
                Constants.HTTP_CONNECT_TIMEOUT,
                TimeUnit.SECONDS
            )
            .build()
    }


    @Singleton
    @Provides
    fun baseRetrofit(
        okHttpClient: OkHttpClient,
        @Named("baseUrl") baseUrl: String
    ): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(baseUrl)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun baseApiService(
        retrofit: Retrofit
    ): ApiService = retrofit.create(ApiService::class.java)

}