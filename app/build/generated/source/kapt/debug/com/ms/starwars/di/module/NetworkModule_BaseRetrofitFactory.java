package com.ms.starwars.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_BaseRetrofitFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<String> baseUrlProvider;

  public NetworkModule_BaseRetrofitFactory(Provider<OkHttpClient> okHttpClientProvider,
      Provider<String> baseUrlProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
    this.baseUrlProvider = baseUrlProvider;
  }

  @Override
  public Retrofit get() {
    return baseRetrofit(okHttpClientProvider.get(), baseUrlProvider.get());
  }

  public static NetworkModule_BaseRetrofitFactory create(
      Provider<OkHttpClient> okHttpClientProvider, Provider<String> baseUrlProvider) {
    return new NetworkModule_BaseRetrofitFactory(okHttpClientProvider, baseUrlProvider);
  }

  public static Retrofit baseRetrofit(OkHttpClient okHttpClient, String baseUrl) {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.baseRetrofit(okHttpClient, baseUrl), "Cannot return null from a non-@Nullable @Provides method");
  }
}
