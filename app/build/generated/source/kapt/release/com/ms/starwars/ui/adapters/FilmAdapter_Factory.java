package com.ms.starwars.ui.adapters;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FilmAdapter_Factory implements Factory<FilmAdapter> {
  @Override
  public FilmAdapter get() {
    return newInstance();
  }

  public static FilmAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FilmAdapter newInstance() {
    return new FilmAdapter();
  }

  private static final class InstanceHolder {
    private static final FilmAdapter_Factory INSTANCE = new FilmAdapter_Factory();
  }
}
