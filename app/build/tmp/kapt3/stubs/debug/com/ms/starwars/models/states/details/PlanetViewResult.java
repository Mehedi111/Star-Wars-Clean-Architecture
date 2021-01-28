package com.ms.starwars.models.states.details;

import java.lang.System;

/**
 * Created by Mehedi Hasan on 1/22/2021.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/ms/starwars/models/states/details/PlanetViewResult;", "", "()V", "Error", "Loading", "Success", "Lcom/ms/starwars/models/states/details/PlanetViewResult$Success;", "Lcom/ms/starwars/models/states/details/PlanetViewResult$Error;", "Lcom/ms/starwars/models/states/details/PlanetViewResult$Loading;", "app_debug"})
public abstract class PlanetViewResult {
    
    private PlanetViewResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/ms/starwars/models/states/details/PlanetViewResult$Success;", "Lcom/ms/starwars/models/states/details/PlanetViewResult;", "data", "Lcom/ms/starwars/models/PlanetEntity;", "(Lcom/ms/starwars/models/PlanetEntity;)V", "getData", "()Lcom/ms/starwars/models/PlanetEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success extends com.ms.starwars.models.states.details.PlanetViewResult {
        @org.jetbrains.annotations.NotNull()
        private final com.ms.starwars.models.PlanetEntity data = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.ms.starwars.models.PlanetEntity getData() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.NotNull()
        com.ms.starwars.models.PlanetEntity data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ms.starwars.models.PlanetEntity component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ms.starwars.models.states.details.PlanetViewResult.Success copy(@org.jetbrains.annotations.NotNull()
        com.ms.starwars.models.PlanetEntity data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ms/starwars/models/states/details/PlanetViewResult$Error;", "Lcom/ms/starwars/models/states/details/PlanetViewResult;", "message", "", "(I)V", "getMessage", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class Error extends com.ms.starwars.models.states.details.PlanetViewResult {
        private final int message = 0;
        
        public final int getMessage() {
            return 0;
        }
        
        public Error(@androidx.annotation.StringRes()
        int message) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ms.starwars.models.states.details.PlanetViewResult.Error copy(@androidx.annotation.StringRes()
        int message) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ms/starwars/models/states/details/PlanetViewResult$Loading;", "Lcom/ms/starwars/models/states/details/PlanetViewResult;", "()V", "app_debug"})
    public static final class Loading extends com.ms.starwars.models.states.details.PlanetViewResult {
        @org.jetbrains.annotations.NotNull()
        public static final com.ms.starwars.models.states.details.PlanetViewResult.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
}