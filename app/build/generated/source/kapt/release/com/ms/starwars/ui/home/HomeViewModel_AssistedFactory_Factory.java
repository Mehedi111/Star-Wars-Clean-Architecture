package com.ms.starwars.ui.home;

import com.ms.domain.models.Character;
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
public final class HomeViewModel_AssistedFactory_Factory implements Factory<HomeViewModel_AssistedFactory> {
  private final Provider<BaseUseCase<String, Flow<List<Character>>>> searchCharactersBaseUseCaseProvider;

  public HomeViewModel_AssistedFactory_Factory(
      Provider<BaseUseCase<String, Flow<List<Character>>>> searchCharactersBaseUseCaseProvider) {
    this.searchCharactersBaseUseCaseProvider = searchCharactersBaseUseCaseProvider;
  }

  @Override
  public HomeViewModel_AssistedFactory get() {
    return newInstance(searchCharactersBaseUseCaseProvider);
  }

  public static HomeViewModel_AssistedFactory_Factory create(
      Provider<BaseUseCase<String, Flow<List<Character>>>> searchCharactersBaseUseCaseProvider) {
    return new HomeViewModel_AssistedFactory_Factory(searchCharactersBaseUseCaseProvider);
  }

  public static HomeViewModel_AssistedFactory newInstance(
      Provider<BaseUseCase<String, Flow<List<Character>>>> searchCharactersBaseUseCase) {
    return new HomeViewModel_AssistedFactory(searchCharactersBaseUseCase);
  }
}
