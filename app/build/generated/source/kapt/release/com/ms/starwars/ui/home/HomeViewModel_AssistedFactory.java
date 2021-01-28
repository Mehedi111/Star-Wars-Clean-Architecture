package com.ms.starwars.ui.home;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.ms.domain.models.Character;
import com.ms.domain.usecase.BaseUseCase;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class HomeViewModel_AssistedFactory implements ViewModelAssistedFactory<HomeViewModel> {
  private final Provider<BaseUseCase<String, Flow<List<Character>>>> searchCharactersBaseUseCase;

  @Inject
  HomeViewModel_AssistedFactory(
      Provider<BaseUseCase<String, Flow<List<Character>>>> searchCharactersBaseUseCase) {
    this.searchCharactersBaseUseCase = searchCharactersBaseUseCase;
  }

  @Override
  @NonNull
  public HomeViewModel create(@NonNull SavedStateHandle arg0) {
    return new HomeViewModel(searchCharactersBaseUseCase.get());
  }
}
