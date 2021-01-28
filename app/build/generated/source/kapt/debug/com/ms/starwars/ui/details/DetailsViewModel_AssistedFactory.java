package com.ms.starwars.ui.details;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.ms.domain.models.Film;
import com.ms.domain.models.Planet;
import com.ms.domain.models.Specie;
import com.ms.domain.usecase.BaseUseCase;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class DetailsViewModel_AssistedFactory implements ViewModelAssistedFactory<DetailsViewModel> {
  private final Provider<BaseUseCase<String, Flow<List<Specie>>>> getSpeciesUseCase;

  private final Provider<BaseUseCase<String, Flow<Planet>>> getPlanetUseCase;

  private final Provider<BaseUseCase<String, Flow<List<Film>>>> getFilmsUseCase;

  @Inject
  DetailsViewModel_AssistedFactory(
      Provider<BaseUseCase<String, Flow<List<Specie>>>> getSpeciesUseCase,
      Provider<BaseUseCase<String, Flow<Planet>>> getPlanetUseCase,
      Provider<BaseUseCase<String, Flow<List<Film>>>> getFilmsUseCase) {
    this.getSpeciesUseCase = getSpeciesUseCase;
    this.getPlanetUseCase = getPlanetUseCase;
    this.getFilmsUseCase = getFilmsUseCase;
  }

  @Override
  @NonNull
  public DetailsViewModel create(@NonNull SavedStateHandle arg0) {
    return new DetailsViewModel(getSpeciesUseCase.get(), getPlanetUseCase.get(),
        getFilmsUseCase.get());
  }
}
