package com.ms.starwars.ui.home;

import com.ms.starwars.ui.adapters.SearchedCharacterAdapter;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class HomeActivity_MembersInjector implements MembersInjector<HomeActivity> {
  private final Provider<SearchedCharacterAdapter> searchedCharacterAdapterProvider;

  public HomeActivity_MembersInjector(
      Provider<SearchedCharacterAdapter> searchedCharacterAdapterProvider) {
    this.searchedCharacterAdapterProvider = searchedCharacterAdapterProvider;
  }

  public static MembersInjector<HomeActivity> create(
      Provider<SearchedCharacterAdapter> searchedCharacterAdapterProvider) {
    return new HomeActivity_MembersInjector(searchedCharacterAdapterProvider);
  }

  @Override
  public void injectMembers(HomeActivity instance) {
    injectSearchedCharacterAdapter(instance, searchedCharacterAdapterProvider.get());
  }

  @InjectedFieldSignature("com.ms.starwars.ui.home.HomeActivity.searchedCharacterAdapter")
  public static void injectSearchedCharacterAdapter(HomeActivity instance,
      SearchedCharacterAdapter searchedCharacterAdapter) {
    instance.searchedCharacterAdapter = searchedCharacterAdapter;
  }
}
