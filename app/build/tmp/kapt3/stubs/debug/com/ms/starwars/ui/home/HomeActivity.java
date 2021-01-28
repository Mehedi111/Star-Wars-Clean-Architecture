package com.ms.starwars.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\u0016\u0010\u0018\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u0012H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\u0012\u0010\u001e\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\""}, d2 = {"Lcom/ms/starwars/ui/home/HomeActivity;", "Lcom/ms/starwars/ui/base/BaseActivity;", "()V", "binding", "Lcom/ms/starwars/databinding/ActivityHomeBinding;", "searchedCharacterAdapter", "Lcom/ms/starwars/ui/adapters/SearchedCharacterAdapter;", "getSearchedCharacterAdapter", "()Lcom/ms/starwars/ui/adapters/SearchedCharacterAdapter;", "setSearchedCharacterAdapter", "(Lcom/ms/starwars/ui/adapters/SearchedCharacterAdapter;)V", "viewModel", "Lcom/ms/starwars/ui/home/HomeViewModel;", "getViewModel", "()Lcom/ms/starwars/ui/home/HomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "handleErrorView", "", "message", "", "handleLoadingView", "handleNoSearchResultsView", "handleSearchResultView", "handleSearchResults", "searchResults", "", "Lcom/ms/starwars/models/CharacterEntity;", "handleSearchView", "observeSearchResult", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "startEdTransitionOnClick", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeActivity extends com.ms.starwars.ui.base.BaseActivity {
    private com.ms.starwars.databinding.ActivityHomeBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject()
    public com.ms.starwars.ui.adapters.SearchedCharacterAdapter searchedCharacterAdapter;
    private java.util.HashMap _$_findViewCache;
    
    private final com.ms.starwars.ui.home.HomeViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ms.starwars.ui.adapters.SearchedCharacterAdapter getSearchedCharacterAdapter() {
        return null;
    }
    
    public final void setSearchedCharacterAdapter(@org.jetbrains.annotations.NotNull()
    com.ms.starwars.ui.adapters.SearchedCharacterAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * start transition at the first click on search edit text
     */
    private final void startEdTransitionOnClick() {
    }
    
    /**
     * handle user query from search edit text
     * doOnTextChanged will be invoked when text is changing
     */
    private final void handleSearchView() {
    }
    
    /**
     * subscribed observer to observe search result
     */
    private final void observeSearchResult() {
    }
    
    /**
     * update views as per search result from api
     * @param searchResults is the api response according to user query
     */
    private final void handleSearchResults(java.util.List<com.ms.starwars.models.CharacterEntity> searchResults) {
    }
    
    /**
     * update views after getting search result
     */
    private final void handleSearchResultView() {
    }
    
    /**
     * update views at loading state
     */
    private final void handleLoadingView() {
    }
    
    /**
     * update views if no matching character found
     */
    private final void handleNoSearchResultsView() {
    }
    
    /**
     * update views if get error response
     */
    private final void handleErrorView(java.lang.String message) {
    }
    
    public HomeActivity() {
        super();
    }
}