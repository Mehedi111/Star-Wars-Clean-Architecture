package com.ms.starwars.di.module;

import com.ms.data.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_BaseApiServiceFactory implements Factory<ApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_BaseApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return baseApiService(retrofitProvider.get());
  }

  public static NetworkModule_BaseApiServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_BaseApiServiceFactory(retrofitProvider);
  }

  public static ApiService baseApiService(Retrofit retrofit) {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.baseApiService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
