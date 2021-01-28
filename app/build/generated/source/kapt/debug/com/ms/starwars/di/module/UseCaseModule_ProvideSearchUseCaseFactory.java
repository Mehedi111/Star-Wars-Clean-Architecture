package com.ms.starwars.di.module;

import com.ms.domain.models.Character;
import com.ms.domain.repository.CharacterSearchDataSource;
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
public final class UseCaseModule_ProvideSearchUseCaseFactory implements Factory<BaseUseCase<String, Flow<List<Character>>>> {
  private final Provider<CharacterSearchDataSource> characterSearchDataSourceProvider;

  public UseCaseModule_ProvideSearchUseCaseFactory(
      Provider<CharacterSearchDataSource> characterSearchDataSourceProvider) {
    this.characterSearchDataSourceProvider = characterSearchDataSourceProvider;
  }

  @Override
  public BaseUseCase<String, Flow<List<Character>>> get() {
    return provideSearchUseCase(characterSearchDataSourceProvider.get());
  }

  public static UseCaseModule_ProvideSearchUseCaseFactory create(
      Provider<CharacterSearchDataSource> characterSearchDataSourceProvider) {
    return new UseCaseModule_ProvideSearchUseCaseFactory(characterSearchDataSourceProvider);
  }

  public static BaseUseCase<String, Flow<List<Character>>> provideSearchUseCase(
      CharacterSearchDataSource characterSearchDataSource) {
    return Preconditions.checkNotNull(UseCaseModule.INSTANCE.provideSearchUseCase(characterSearchDataSource), "Cannot return null from a non-@Nullable @Provides method");
  }
}
