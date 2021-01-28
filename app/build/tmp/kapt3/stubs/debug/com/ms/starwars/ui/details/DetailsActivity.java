package com.ms.starwars.ui.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020\u0018H\u0002J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u001cH\u0002J\b\u0010%\u001a\u00020\u0018H\u0002J\b\u0010&\u001a\u00020\u0018H\u0002J\u0012\u0010\'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u001cH\u0002J\u0012\u0010+\u001a\u00020\u00182\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\u0018\u0010.\u001a\u00020\u00182\u000e\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100H\u0002J\u0012\u00102\u001a\u00020\u00182\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u0018\u00105\u001a\u00020\u00182\u000e\u00106\u001a\n\u0012\u0004\u0012\u000207\u0018\u000100H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u00a8\u00068"}, d2 = {"Lcom/ms/starwars/ui/details/DetailsActivity;", "Lcom/ms/starwars/ui/base/BaseActivity;", "()V", "binding", "Lcom/ms/starwars/databinding/ActivityDetailsBinding;", "filmAdapter", "Lcom/ms/starwars/ui/adapters/FilmAdapter;", "getFilmAdapter", "()Lcom/ms/starwars/ui/adapters/FilmAdapter;", "setFilmAdapter", "(Lcom/ms/starwars/ui/adapters/FilmAdapter;)V", "speciesAdapter", "Lcom/ms/starwars/ui/adapters/SpeciesAdapter;", "getSpeciesAdapter", "()Lcom/ms/starwars/ui/adapters/SpeciesAdapter;", "setSpeciesAdapter", "(Lcom/ms/starwars/ui/adapters/SpeciesAdapter;)V", "viewModel", "Lcom/ms/starwars/ui/details/DetailsViewModel;", "getViewModel", "()Lcom/ms/starwars/ui/details/DetailsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getCharacterParcel", "", "handleFilmLoadingView", "handleFilmsErrorView", "message", "", "handleFilmsLoadCompletedView", "handlePlanetErrorView", "handlePlanetLoadingView", "handleSpeciesErrorView", "handleSpeciesLoadingView", "observeFilmsDetails", "observeNetworkChanges", "url", "observePlanetDetails", "observeSpeciesDetails", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "requestCharacterDetails", "updateCharacterBasicInfo", "characterEntity", "Lcom/ms/starwars/models/CharacterEntity;", "updateFilmsView", "films", "", "Lcom/ms/starwars/models/FilmEntity;", "updatePlanetView", "planet", "Lcom/ms/starwars/models/PlanetEntity;", "updateSpeciesView", "species", "Lcom/ms/starwars/models/SpecieEntity;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DetailsActivity extends com.ms.starwars.ui.base.BaseActivity {
    private com.ms.starwars.databinding.ActivityDetailsBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject()
    public com.ms.starwars.ui.adapters.SpeciesAdapter speciesAdapter;
    @javax.inject.Inject()
    public com.ms.starwars.ui.adapters.FilmAdapter filmAdapter;
    private java.util.HashMap _$_findViewCache;
    
    private final com.ms.starwars.ui.details.DetailsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ms.starwars.ui.adapters.SpeciesAdapter getSpeciesAdapter() {
        return null;
    }
    
    public final void setSpeciesAdapter(@org.jetbrains.annotations.NotNull()
    com.ms.starwars.ui.adapters.SpeciesAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ms.starwars.ui.adapters.FilmAdapter getFilmAdapter() {
        return null;
    }
    
    public final void setFilmAdapter(@org.jetbrains.annotations.NotNull()
    com.ms.starwars.ui.adapters.FilmAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * get parcelable character object
     * and subscribed network change observer
     * and pass character details url to get character details
     */
    private final void getCharacterParcel() {
    }
    
    /**
     * @param characterEntity is parcel object from [com.ms.starwars.ui.home.HomeActivity]
     */
    private final void updateCharacterBasicInfo(com.ms.starwars.models.CharacterEntity characterEntity) {
    }
    
    /**
     * subscribe network change observer
     * @param url character details url
     * if network is connected and viewResult is in an error sate then retry to get character details
     */
    private final void observeNetworkChanges(java.lang.String url) {
    }
    
    /**
     * @param url is the character details url, pass to get individual details
     */
    private final void requestCharacterDetails(java.lang.String url) {
    }
    
    /**
     * subscribe planet details observer
     */
    private final void observePlanetDetails() {
    }
    
    /**
     * update planet details views at loading state
     */
    private final void handlePlanetLoadingView() {
    }
    
    /**
     * update planet views if get error response
     */
    private final void handlePlanetErrorView(java.lang.String message) {
    }
    
    /**
     * subscribe species details observer
     */
    private final void observeSpeciesDetails() {
    }
    
    /**
     * update species details views at loading state
     */
    private final void handleSpeciesLoadingView() {
    }
    
    /**
     * update species views if get error response
     */
    private final void handleSpeciesErrorView(java.lang.String message) {
    }
    
    /**
     * subscribe films details observer
     */
    private final void observeFilmsDetails() {
    }
    
    /**
     * update film details views at loading state
     */
    private final void handleFilmLoadingView() {
    }
    
    /**
     * update film views if get error response
     */
    private final void handleFilmsErrorView(java.lang.String message) {
    }
    
    /**
     * hide mini progress after getting all film content
     */
    private final void handleFilmsLoadCompletedView() {
    }
    
    /**
     * update planet views after getting success response
     * @param planet details of character
     */
    private final void updatePlanetView(com.ms.starwars.models.PlanetEntity planet) {
    }
    
    /**
     * update films views after getting each film details
     * @param films details list of character
     */
    private final void updateFilmsView(java.util.List<com.ms.starwars.models.FilmEntity> films) {
    }
    
    /**
     * update species views after getting species details
     * @param species details list of character
     */
    private final void updateSpeciesView(java.util.List<com.ms.starwars.models.SpecieEntity> species) {
    }
    
    public DetailsActivity() {
        super();
    }
}