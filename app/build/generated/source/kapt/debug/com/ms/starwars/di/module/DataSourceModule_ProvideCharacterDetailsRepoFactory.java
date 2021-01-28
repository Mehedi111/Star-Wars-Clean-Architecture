package com.ms.starwars.di.module;

import com.ms.data.api.ApiService;
import com.ms.domain.repository.CharacterDetailsDataSource;
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
public final class DataSourceModule_ProvideCharacterDetailsRepoFactory implements Factory<CharacterDetailsDataSource> {
  private final Provider<ApiService> apiServiceProvider;

  public DataSourceModule_ProvideCharacterDetailsRepoFactory(
      Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public CharacterDetailsDataSource get() {
    return provideCharacterDetailsRepo(apiServiceProvider.get());
  }

  public static DataSourceModule_ProvideCharacterDetailsRepoFactory create(
      Provider<ApiService> apiServiceProvider) {
    return new DataSourceModule_ProvideCharacterDetailsRepoFactory(apiServiceProvider);
  }

  public static CharacterDetailsDataSource provideCharacterDetailsRepo(ApiService apiService) {
    return Preconditions.checkNotNull(DataSourceModule.INSTANCE.provideCharacterDetailsRepo(apiService), "Cannot return null from a non-@Nullable @Provides method");
  }
}
