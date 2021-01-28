package com.ms.starwars.di.module;

import com.ms.domain.models.Planet;
import com.ms.domain.repository.CharacterDetailsDataSource;
import com.ms.domain.usecase.BaseUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class UseCaseModule_ProvidePlanetUseCaseFactory implements Factory<BaseUseCase<String, Flow<Planet>>> {
  private final Provider<CharacterDetailsDataSource> characterDetailsDataSourceProvider;

  public UseCaseModule_ProvidePlanetUseCaseFactory(
      Provider<CharacterDetailsDataSource> characterDetailsDataSourceProvider) {
    this.characterDetailsDataSourceProvider = characterDetailsDataSourceProvider;
  }

  @Override
  public BaseUseCase<String, Flow<Planet>> get() {
    return providePlanetUseCase(characterDetailsDataSourceProvider.get());
  }

  public static UseCaseModule_ProvidePlanetUseCaseFactory create(
      Provider<CharacterDetailsDataSource> characterDetailsDataSourceProvider) {
    return new UseCaseModule_ProvidePlanetUseCaseFactory(characterDetailsDataSourceProvider);
  }

  public static BaseUseCase<String, Flow<Planet>> providePlanetUseCase(
      CharacterDetailsDataSource characterDetailsDataSource) {
    return Preconditions.checkNotNull(UseCaseModule.INSTANCE.providePlanetUseCase(characterDetailsDataSource), "Cannot return null from a non-@Nullable @Provides method");
  }
}
