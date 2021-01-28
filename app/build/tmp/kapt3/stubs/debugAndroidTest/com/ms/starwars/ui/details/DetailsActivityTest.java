package com.ms.starwars.ui.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0017J\b\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\r\u001a\u00020\u000bH\u0007R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/ms/starwars/ui/details/DetailsActivityTest;", "Lcom/ms/starwars/ui/BaseActivityTest;", "()V", "activityRule", "Landroidx/test/rule/ActivityTestRule;", "Lcom/ms/starwars/ui/details/DetailsActivity;", "getActivityRule", "()Landroidx/test/rule/ActivityTestRule;", "setActivityRule", "(Landroidx/test/rule/ActivityTestRule;)V", "tearDown", "", "test_profileViewWithValidCharacterEntity", "test_snackBarWithErrorMessageIfParcelIsNull", "app_debug"})
@dagger.hilt.android.testing.HiltAndroidTest()
@org.junit.runner.RunWith(value = androidx.test.ext.junit.runners.AndroidJUnit4.class)
@dagger.hilt.android.testing.UninstallModules(value = {com.ms.starwars.di.module.UrlProviderModule.class})
public final class DetailsActivityTest extends com.ms.starwars.ui.BaseActivityTest {
    @org.jetbrains.annotations.NotNull()
    private androidx.test.rule.ActivityTestRule<com.ms.starwars.ui.details.DetailsActivity> activityRule;
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule()
    public final androidx.test.rule.ActivityTestRule<com.ms.starwars.ui.details.DetailsActivity> getActivityRule() {
        return null;
    }
    
    public final void setActivityRule(@org.jetbrains.annotations.NotNull()
    androidx.test.rule.ActivityTestRule<com.ms.starwars.ui.details.DetailsActivity> p0) {
    }
    
    @org.junit.Test()
    public final void test_snackBarWithErrorMessageIfParcelIsNull() {
    }
    
    @org.junit.Test()
    public final void test_profileViewWithValidCharacterEntity() {
    }
    
    @java.lang.Override()
    @org.junit.After()
    public void tearDown() {
    }
    
    public DetailsActivityTest() {
        super();
    }
}