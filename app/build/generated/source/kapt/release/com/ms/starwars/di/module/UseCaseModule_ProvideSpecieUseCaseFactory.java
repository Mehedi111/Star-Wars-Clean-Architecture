package com.ms.starwars.di.module;

import com.ms.domain.models.Specie;
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
public final class UseCaseModule_ProvideSpecieUseCaseFactory implements Factory<BaseUseCase<String, Flow<List<Specie>>>> {
  private final Provider<CharacterDetailsDataSource> characterDetailsDataSourceProvider;

  public UseCaseModule_ProvideSpecieUseCaseFactory(
      Provider<CharacterDetailsDataSource> characterDetailsDataSourceProvider) {
    this.characterDetailsDataSourceProvider = characterDetailsDataSourceProvider;
  }

  @Override
  public BaseUseCase<String, Flow<List<Specie>>> get() {
    return provideSpecieUseCase(characterDetailsDataSourceProvider.get());
  }

  public static UseCaseModule_ProvideSpecieUseCaseFactory create(
      Provider<CharacterDetailsDataSource> characterDetailsDataSourceProvider) {
    return new UseCaseModule_ProvideSpecieUseCaseFactory(characterDetailsDataSourceProvider);
  }

  public static BaseUseCase<String, Flow<List<Specie>>> provideSpecieUseCase(
      CharacterDetailsDataSource characterDetailsDataSource) {
    return Preconditions.checkNotNull(UseCaseModule.INSTANCE.provideSpecieUseCase(characterDetailsDataSource), "Cannot return null from a non-@Nullable @Provides method");
  }
}
