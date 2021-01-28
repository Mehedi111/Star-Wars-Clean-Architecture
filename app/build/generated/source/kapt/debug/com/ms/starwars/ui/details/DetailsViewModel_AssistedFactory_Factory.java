package com.ms.starwars.ui.details;

import com.ms.domain.models.Film;
import com.ms.domain.models.Planet;
import com.ms.domain.models.Specie;
import com.ms.domain.usecase.BaseUseCase;
import dagger.internal.Factory;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Flow;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DetailsViewModel_AssistedFactory_Factory implements Factory<DetailsViewModel_AssistedFactory> {
  private final Provider<BaseUseCase<String, Flow<List<Specie>>>> getSpeciesUseCaseProvider;

  private final Provider<BaseUseCase<String, Flow<Planet>>> getPlanetUseCaseProvider;

  private final Provider<BaseUseCase<String, Flow<List<Film>>>> getFilmsUseCaseProvider;

  public DetailsViewModel_AssistedFactory_Factory(
      Provider<BaseUseCase<String, Flow<List<Specie>>>> getSpeciesUseCaseProvider,
      Provider<BaseUseCase<String, Flow<Planet>>> getPlanetUseCaseProvider,
      Provider<BaseUseCase<String, Flow<List<Film>>>> getFilmsUseCaseProvider) {
    this.getSpeciesUseCaseProvider = getSpeciesUseCaseProvider;
    this.getPlanetUseCaseProvider = getPlanetUseCaseProvider;
    this.getFilmsUseCaseProvider = getFilmsUseCaseProvider;
  }

  @Override
  public DetailsViewModel_AssistedFactory get() {
    return newInstance(getSpeciesUseCaseProvider, getPlanetUseCaseProvider, getFilmsUseCaseProvider);
  }

  public static DetailsViewModel_AssistedFactory_Factory create(
      Provider<BaseUseCase<String, Flow<List<Specie>>>> getSpeciesUseCaseProvider,
      Provider<BaseUseCase<String, Flow<Planet>>> getPlanetUseCaseProvider,
      Provider<BaseUseCase<String, Flow<List<Film>>>> getFilmsUseCaseProvider) {
    return new DetailsViewModel_AssistedFactory_Factory(getSpeciesUseCaseProvider, getPlanetUseCaseProvider, getFilmsUseCaseProvider);
  }

  public static DetailsViewModel_AssistedFactory newInstance(
      Provider<BaseUseCase<String, Flow<List<Specie>>>> getSpeciesUseCase,
      Provider<BaseUseCase<String, Flow<Planet>>> getPlanetUseCase,
      Provider<BaseUseCase<String, Flow<List<Film>>>> getFilmsUseCase) {
    return new DetailsViewModel_AssistedFactory(getSpeciesUseCase, getPlanetUseCase, getFilmsUseCase);
  }
}
