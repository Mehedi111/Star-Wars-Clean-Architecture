package com.ms.starwars.ui.details;

import com.ms.starwars.ui.adapters.FilmAdapter;
import com.ms.starwars.ui.adapters.SpeciesAdapter;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DetailsActivity_MembersInjector implements MembersInjector<DetailsActivity> {
  private final Provider<SpeciesAdapter> speciesAdapterProvider;

  private final Provider<FilmAdapter> filmAdapterProvider;

  public DetailsActivity_MembersInjector(Provider<SpeciesAdapter> speciesAdapterProvider,
      Provider<FilmAdapter> filmAdapterProvider) {
    this.speciesAdapterProvider = speciesAdapterProvider;
    this.filmAdapterProvider = filmAdapterProvider;
  }

  public static MembersInjector<DetailsActivity> create(
      Provider<SpeciesAdapter> speciesAdapterProvider, Provider<FilmAdapter> filmAdapterProvider) {
    return new DetailsActivity_MembersInjector(speciesAdapterProvider, filmAdapterProvider);
  }

  @Override
  public void injectMembers(DetailsActivity instance) {
    injectSpeciesAdapter(instance, speciesAdapterProvider.get());
    injectFilmAdapter(instance, filmAdapterProvider.get());
  }

  @InjectedFieldSignature("com.ms.starwars.ui.details.DetailsActivity.speciesAdapter")
  public static void injectSpeciesAdapter(DetailsActivity instance, SpeciesAdapter speciesAdapter) {
    instance.speciesAdapter = speciesAdapter;
  }

  @InjectedFieldSignature("com.ms.starwars.ui.details.DetailsActivity.filmAdapter")
  public static void injectFilmAdapter(DetailsActivity instance, FilmAdapter filmAdapter) {
    instance.filmAdapter = filmAdapter;
  }
}
