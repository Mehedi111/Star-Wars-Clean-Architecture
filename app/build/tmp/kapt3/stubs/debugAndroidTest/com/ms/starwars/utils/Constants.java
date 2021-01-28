package com.ms.starwars.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/ms/starwars/utils/Constants;", "", "()V", "CHARACTER_URL", "", "CHARACTER_URL_EMPTY_SPECIES", "FILMS_URL", "NO_MATCH_CHARACTER_URL", "NO_MATCH_SEARCH_QUERY", "PLANET_URL", "REQUEST_PATH", "SEARCH_QUERY", "SPECIES_URL", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REQUEST_PATH = "/people/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHARACTER_URL = "/api/people/14/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHARACTER_URL_EMPTY_SPECIES = "/api/people/11/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NO_MATCH_CHARACTER_URL = "/api/people/1000/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEARCH_QUERY = "Le";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NO_MATCH_SEARCH_QUERY = "ba";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SPECIES_URL = "/api/species/3/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FILMS_URL = "/api/films/1/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLANET_URL = "/api/planets/14/";
    @org.jetbrains.annotations.NotNull()
    public static final com.ms.starwars.utils.Constants INSTANCE = null;
    
    private Constants() {
        super();
    }
}