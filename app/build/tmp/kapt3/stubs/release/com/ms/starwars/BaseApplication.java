package com.ms.starwars;

import java.lang.System;

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/ms/starwars/BaseApplication;", "Landroid/app/Application;", "()V", "isRoboUnitTest", "", "onCreate", "", "app_release"})
@dagger.hilt.android.HiltAndroidApp()
public final class BaseApplication extends android.app.Application {
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final boolean isRoboUnitTest() {
        return false;
    }
    
    public BaseApplication() {
        super();
    }
}