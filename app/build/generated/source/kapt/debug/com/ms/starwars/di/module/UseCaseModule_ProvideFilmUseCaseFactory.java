package com.ms.starwars.di.module;

import com.ms.domain.models.Film;
import com.ms.domain.repository.CharacterDetailsDataSource;
import com.ms.domain.usecase.BaseUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class UseCaseModule_ProvideFilmUseCaseFactory implements Factory<BaseUseCase<String, Flow<List<Film>>>> {
  private final Provider<CharacterDetailsDataSource> characterDetailsDataSourceProvider;

  public UseCaseModule_ProvideFilmUseCaseFactory(
      Provider<CharacterDetailsDataSource> characterDetailsDataSourceProvider) {
    this.characterDetailsDataSourceProvider = characterDetailsDataSourceProvider;
  }

  @Override
  public BaseUseCase<String, Flow<List<Film>>> get() {
    return provideFilmUseCase(characterDetailsDataSourceProvider.get());
  }

  public static UseCaseModule_ProvideFilmUseCaseFactory create(
      Provider<CharacterDetailsDataSource> characterDetailsDataSourceProvider) {
    return new UseCaseModule_ProvideFilmUseCaseFactory(characterDetailsDataSourceProvider);
  }

  public static BaseUseCase<String, Flow<List<Film>>> provideFilmUseCase(
      CharacterDetailsDataSource characterDetailsDataSource) {
    return Preconditions.checkNotNull(UseCaseModule.INSTANCE.provideFilmUseCase(characterDetailsDataSource), "Cannot return null from a non-@Nullable @Provides method");
  }
}
