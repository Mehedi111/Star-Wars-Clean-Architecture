package com.ms.starwars.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_BaseOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<HttpLoggingInterceptor> loggingInterceptorProvider;

  public NetworkModule_BaseOkHttpClientFactory(
      Provider<HttpLoggingInterceptor> loggingInterceptorProvider) {
    this.loggingInterceptorProvider = loggingInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return baseOkHttpClient(loggingInterceptorProvider.get());
  }

  public static NetworkModule_BaseOkHttpClientFactory create(
      Provider<HttpLoggingInterceptor> loggingInterceptorProvider) {
    return new NetworkModule_BaseOkHttpClientFactory(loggingInterceptorProvider);
  }

  public static OkHttpClient baseOkHttpClient(HttpLoggingInterceptor loggingInterceptor) {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.baseOkHttpClient(loggingInterceptor), "Cannot return null from a non-@Nullable @Provides method");
  }
}
