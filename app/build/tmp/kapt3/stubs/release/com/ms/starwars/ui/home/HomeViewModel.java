package com.ms.starwars.ui.home;

import java.lang.System;

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B0\b\u0007\u0012\'\u0010\u0002\u001a#\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0003j\u0002`\b\u00a2\u0006\u0002\b\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0004R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u0002\u001a#\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0003j\u0002`\b\u00a2\u0006\u0002\b\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001a"}, d2 = {"Lcom/ms/starwars/ui/home/HomeViewModel;", "Lcom/ms/starwars/ui/base/BaseViewModel;", "searchCharactersBaseUseCase", "Lcom/ms/domain/usecase/BaseUseCase;", "", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/ms/domain/models/Character;", "Lcom/ms/domain/usecase/BaseUseCaseSearchCharacter;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Lcom/ms/domain/usecase/BaseUseCase;)V", "_searchViewResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ms/starwars/models/states/SearchViewResult;", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "searchJob", "Lkotlinx/coroutines/Job;", "searchViewResult", "Landroidx/lifecycle/LiveData;", "getSearchViewResult", "()Landroidx/lifecycle/LiveData;", "onCleared", "", "searchCharacter", "query", "app_release"})
public final class HomeViewModel extends com.ms.starwars.ui.base.BaseViewModel {
    private kotlinx.coroutines.Job searchJob;
    private androidx.lifecycle.MutableLiveData<com.ms.starwars.models.states.SearchViewResult> _searchViewResult;
    
    /**
     * coroutineExceptionHandler will handle uncaught exceptions.
     */
    private final kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = null;
    private final com.ms.domain.usecase.BaseUseCase<java.lang.String, kotlinx.coroutines.flow.Flow<java.util.List<com.ms.domain.models.Character>>> searchCharactersBaseUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ms.starwars.models.states.SearchViewResult> getSearchViewResult() {
        return null;
    }
    
    /**
     * @param query is the user input
     */
    public final void searchCharacter(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.ms.domain.usecase.BaseUseCase<java.lang.String, kotlinx.coroutines.flow.Flow<java.util.List<com.ms.domain.models.Character>>> searchCharactersBaseUseCase) {
        super();
    }
}