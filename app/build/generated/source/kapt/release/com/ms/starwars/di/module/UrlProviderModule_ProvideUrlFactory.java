package com.ms.starwars.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UrlProviderModule_ProvideUrlFactory implements Factory<String> {
  @Override
  public String get() {
    return provideUrl();
  }

  public static UrlProviderModule_ProvideUrlFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provideUrl() {
    return Preconditions.checkNotNull(UrlProviderModule.INSTANCE.provideUrl(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final UrlProviderModule_ProvideUrlFactory INSTANCE = new UrlProviderModule_ProvideUrlFactory();
  }
}
