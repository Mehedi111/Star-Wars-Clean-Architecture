package com.ms.starwars.ui.base;

import java.lang.System;

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u0007J!\u0010\b\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nH\u0000\u00a2\u0006\u0002\b\fJ\u001f\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u00a2\u0006\u0002\b\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/ms/starwars/ui/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "moveToDetails", "", "characterEntity", "Lcom/ms/starwars/models/CharacterEntity;", "moveToDetails$app_debug", "onNetworkChange", "callback", "Lkotlin/Function1;", "", "onNetworkChange$app_debug", "showSnackBar", "parentLayout", "Landroid/view/View;", "message", "", "showSnackBar$app_debug", "app_debug"})
public class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private java.util.HashMap _$_findViewCache;
    
    /**
     * observe network change and
     * notifying subscribers
     * @param callback is subscribers for getting network change info.
     */
    public final void onNetworkChange$app_debug(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
    
    /**
     * @param parentLayout is the root view
     * @param message what will be shown
     */
    public final void showSnackBar$app_debug(@org.jetbrains.annotations.Nullable()
    android.view.View parentLayout, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    /**
     * move character's search page to details page with
     * selected character info from search result
     * @param characterEntity is the selected character model.
     */
    public final void moveToDetails$app_debug(@org.jetbrains.annotations.NotNull()
    com.ms.starwars.models.CharacterEntity characterEntity) {
    }
    
    public BaseActivity() {
        super();
    }
}