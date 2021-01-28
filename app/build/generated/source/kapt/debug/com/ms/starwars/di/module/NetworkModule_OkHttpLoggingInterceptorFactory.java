package com.ms.starwars.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_OkHttpLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {
  @Override
  public HttpLoggingInterceptor get() {
    return okHttpLoggingInterceptor();
  }

  public static NetworkModule_OkHttpLoggingInterceptorFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HttpLoggingInterceptor okHttpLoggingInterceptor() {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.okHttpLoggingInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final NetworkModule_OkHttpLoggingInterceptorFactory INSTANCE = new NetworkModule_OkHttpLoggingInterceptorFactory();
  }
}
