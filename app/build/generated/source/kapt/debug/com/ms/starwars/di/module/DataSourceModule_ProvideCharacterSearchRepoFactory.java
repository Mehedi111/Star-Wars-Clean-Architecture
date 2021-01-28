package com.ms.starwars.di.module;

import com.ms.data.api.ApiService;
import com.ms.domain.repository.CharacterSearchDataSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DataSourceModule_ProvideCharacterSearchRepoFactory implements Factory<CharacterSearchDataSource> {
  private final Provider<ApiService> apiServiceProvider;

  public DataSourceModule_ProvideCharacterSearchRepoFactory(
      Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public CharacterSearchDataSource get() {
    return provideCharacterSearchRepo(apiServiceProvider.get());
  }

  public static DataSourceModule_ProvideCharacterSearchRepoFactory create(
      Provider<ApiService> apiServiceProvider) {
    return new DataSourceModule_ProvideCharacterSearchRepoFactory(apiServiceProvider);
  }

  public static CharacterSearchDataSource provideCharacterSearchRepo(ApiService apiService) {
    return Preconditions.checkNotNull(DataSourceModule.INSTANCE.provideCharacterSearchRepo(apiService), "Cannot return null from a non-@Nullable @Provides method");
  }
}
