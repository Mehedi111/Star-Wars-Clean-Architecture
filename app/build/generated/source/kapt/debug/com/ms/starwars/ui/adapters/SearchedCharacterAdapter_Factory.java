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
public final class SearchedCharacterAdapter_Factory implements Factory<SearchedCharacterAdapter> {
  @Override
  public SearchedCharacterAdapter get() {
    return newInstance();
  }

  public static SearchedCharacterAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SearchedCharacterAdapter newInstance() {
    return new SearchedCharacterAdapter();
  }

  private static final class InstanceHolder {
    private static final SearchedCharacterAdapter_Factory INSTANCE = new SearchedCharacterAdapter_Factory();
  }
}
