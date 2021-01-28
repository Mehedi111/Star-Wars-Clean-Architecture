package com.ms.starwars.ui.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B|\b\u0007\u0012\'\u0010\u0002\u001a#\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0003j\u0002`\b\u00a2\u0006\u0002\b\t\u0012!\u0010\n\u001a\u001d\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u0003j\u0002`\f\u00a2\u0006\u0002\b\t\u0012\'\u0010\r\u001a#\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00060\u00050\u0003j\u0002`\u000f\u00a2\u0006\u0002\b\t\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0004J\u000e\u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0004J\u000e\u0010,\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0004J\u0019\u0010-\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0004H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0019\u0010/\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0004H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0019\u00100\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0004H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\b\u00101\u001a\u00020)H\u0014R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R/\u0010\r\u001a#\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00060\u00050\u0003j\u0002`\u000f\u00a2\u0006\u0002\b\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\n\u001a\u001d\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u0003j\u0002`\f\u00a2\u0006\u0002\b\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u0002\u001a#\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0003j\u0002`\b\u00a2\u0006\u0002\b\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u00198F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u001bR\u000e\u0010\"\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170\u00198F\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u001bR\u000e\u0010&\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00062"}, d2 = {"Lcom/ms/starwars/ui/details/DetailsViewModel;", "Lcom/ms/starwars/ui/base/BaseViewModel;", "getSpeciesUseCase", "Lcom/ms/domain/usecase/BaseUseCase;", "", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/ms/domain/models/Specie;", "Lcom/ms/domain/usecase/BaseUseCaseGetSpecies;", "Lkotlin/jvm/JvmSuppressWildcards;", "getPlanetUseCase", "Lcom/ms/domain/models/Planet;", "Lcom/ms/domain/usecase/BaseUseCaseGetPlanet;", "getFilmsUseCase", "Lcom/ms/domain/models/Film;", "Lcom/ms/domain/usecase/BaseUseCaseGetFilm;", "(Lcom/ms/domain/usecase/BaseUseCase;Lcom/ms/domain/usecase/BaseUseCase;Lcom/ms/domain/usecase/BaseUseCase;)V", "_filmsDetailViewResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ms/starwars/models/states/details/FilmsViewResult;", "_planetDetailViewResult", "Lcom/ms/starwars/models/states/details/PlanetViewResult;", "_speciesDetailViewResult", "Lcom/ms/starwars/models/states/details/SpeciesViewResult;", "filmsDetailViewResult", "Landroidx/lifecycle/LiveData;", "getFilmsDetailViewResult", "()Landroidx/lifecycle/LiveData;", "filmsDetailsCoroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "filmsDetailsJob", "Lkotlinx/coroutines/Job;", "planetDetailViewResult", "getPlanetDetailViewResult", "planetDetailsCoroutineExceptionHandler", "planetDetailsJob", "speciesDetailViewResult", "getSpeciesDetailViewResult", "speciesDetailsCoroutineExceptionHandler", "speciesDetailsJob", "getFilmsDetails", "", "characterUrl", "getPlanetDetails", "getSpeciesDetails", "loadFilms", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPlanet", "loadSpecies", "onCleared", "app_debug"})
public final class DetailsViewModel extends com.ms.starwars.ui.base.BaseViewModel {
    private kotlinx.coroutines.Job planetDetailsJob;
    private androidx.lifecycle.MutableLiveData<com.ms.starwars.models.states.details.PlanetViewResult> _planetDetailViewResult;
    
    /**
     * planet details uncaught exceptions handler
     */
    private final kotlinx.coroutines.CoroutineExceptionHandler planetDetailsCoroutineExceptionHandler = null;
    private kotlinx.coroutines.Job speciesDetailsJob;
    private androidx.lifecycle.MutableLiveData<com.ms.starwars.models.states.details.SpeciesViewResult> _speciesDetailViewResult;
    
    /**
     * species details uncaught exceptions handler
     */
    private final kotlinx.coroutines.CoroutineExceptionHandler speciesDetailsCoroutineExceptionHandler = null;
    private kotlinx.coroutines.Job filmsDetailsJob;
    private androidx.lifecycle.MutableLiveData<com.ms.starwars.models.states.details.FilmsViewResult> _filmsDetailViewResult;
    
    /**
     * films details uncaught exceptions handler
     */
    private final kotlinx.coroutines.CoroutineExceptionHandler filmsDetailsCoroutineExceptionHandler = null;
    private final com.ms.domain.usecase.BaseUseCase<java.lang.String, kotlinx.coroutines.flow.Flow<java.util.List<com.ms.domain.models.Specie>>> getSpeciesUseCase = null;
    private final com.ms.domain.usecase.BaseUseCase<java.lang.String, kotlinx.coroutines.flow.Flow<com.ms.domain.models.Planet>> getPlanetUseCase = null;
    private final com.ms.domain.usecase.BaseUseCase<java.lang.String, kotlinx.coroutines.flow.Flow<java.util.List<com.ms.domain.models.Film>>> getFilmsUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ms.starwars.models.states.details.PlanetViewResult> getPlanetDetailViewResult() {
        return null;
    }
    
    public final void getPlanetDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String characterUrl) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ms.starwars.models.states.details.SpeciesViewResult> getSpeciesDetailViewResult() {
        return null;
    }
    
    public final void getSpeciesDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String characterUrl) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ms.starwars.models.states.details.FilmsViewResult> getFilmsDetailViewResult() {
        return null;
    }
    
    public final void getFilmsDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String characterUrl) {
    }
    
    /**
     * cancel all job to avoid memory leaks
     */
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public DetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.ms.domain.usecase.BaseUseCase<java.lang.String, kotlinx.coroutines.flow.Flow<java.util.List<com.ms.domain.models.Specie>>> getSpeciesUseCase, @org.jetbrains.annotations.NotNull()
    com.ms.domain.usecase.BaseUseCase<java.lang.String, kotlinx.coroutines.flow.Flow<com.ms.domain.models.Planet>> getPlanetUseCase, @org.jetbrains.annotations.NotNull()
    com.ms.domain.usecase.BaseUseCase<java.lang.String, kotlinx.coroutines.flow.Flow<java.util.List<com.ms.domain.models.Film>>> getFilmsUseCase) {
        super();
    }
}