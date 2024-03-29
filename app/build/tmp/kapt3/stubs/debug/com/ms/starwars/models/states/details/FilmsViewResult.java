package com.ms.starwars.models.states.details;

import java.lang.System;

/**
 * Created by Mehedi Hasan on 1/22/2021.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/ms/starwars/models/states/details/FilmsViewResult;", "", "()V", "Error", "IsCompleted", "Loading", "Success", "Lcom/ms/starwars/models/states/details/FilmsViewResult$Success;", "Lcom/ms/starwars/models/states/details/FilmsViewResult$Error;", "Lcom/ms/starwars/models/states/details/FilmsViewResult$Loading;", "Lcom/ms/starwars/models/states/details/FilmsViewResult$IsCompleted;", "app_debug"})
public abstract class FilmsViewResult {
    
    private FilmsViewResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/ms/starwars/models/states/details/FilmsViewResult$Success;", "Lcom/ms/starwars/models/states/details/FilmsViewResult;", "data", "", "Lcom/ms/starwars/models/FilmEntity;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success extends com.ms.starwars.models.states.details.FilmsViewResult {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.ms.starwars.models.FilmEntity> data = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.ms.starwars.models.FilmEntity> getData() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.NotNull()
        java.util.List<com.ms.starwars.models.FilmEntity> data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.ms.starwars.models.FilmEntity> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ms.starwars.models.states.details.FilmsViewResult.Success copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.ms.starwars.models.FilmEntity> data) {
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ms/starwars/models/states/details/FilmsViewResult$Error;", "Lcom/ms/starwars/models/states/details/FilmsViewResult;", "message", "", "(I)V", "getMessage", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class Error extends com.ms.starwars.models.states.details.FilmsViewResult {
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
        public final com.ms.starwars.models.states.details.FilmsViewResult.Error copy(@androidx.annotation.StringRes()
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ms/starwars/models/states/details/FilmsViewResult$Loading;", "Lcom/ms/starwars/models/states/details/FilmsViewResult;", "()V", "app_debug"})
    public static final class Loading extends com.ms.starwars.models.states.details.FilmsViewResult {
        @org.jetbrains.annotations.NotNull()
        public static final com.ms.starwars.models.states.details.FilmsViewResult.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ms/starwars/models/states/details/FilmsViewResult$IsCompleted;", "Lcom/ms/starwars/models/states/details/FilmsViewResult;", "()V", "app_debug"})
    public static final class IsCompleted extends com.ms.starwars.models.states.details.FilmsViewResult {
        @org.jetbrains.annotations.NotNull()
        public static final com.ms.starwars.models.states.details.FilmsViewResult.IsCompleted INSTANCE = null;
        
        private IsCompleted() {
            super();
        }
    }
}