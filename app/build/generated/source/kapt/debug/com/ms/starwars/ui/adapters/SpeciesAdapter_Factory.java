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
public final class SpeciesAdapter_Factory implements Factory<SpeciesAdapter> {
  @Override
  public SpeciesAdapter get() {
    return newInstance();
  }

  public static SpeciesAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SpeciesAdapter newInstance() {
    return new SpeciesAdapter();
  }

  private static final class InstanceHolder {
    private static final SpeciesAdapter_Factory INSTANCE = new SpeciesAdapter_Factory();
  }
}
