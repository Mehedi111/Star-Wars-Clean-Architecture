package com.ms.starwars.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007J\b\u0010\u0010\u001a\u00020\u000eH\u0007J\b\u0010\u0011\u001a\u00020\u000eH\u0007R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048G\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R!\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00050\u00050\t8G\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/ms/starwars/ui/home/HomeActivityTest;", "Lcom/ms/starwars/ui/BaseActivityTest;", "()V", "activityRule", "Landroidx/test/ext/junit/rules/ActivityScenarioRule;", "Lcom/ms/starwars/ui/home/HomeActivity;", "getActivityRule", "()Landroidx/test/ext/junit/rules/ActivityScenarioRule;", "intentsTestRule", "Landroidx/test/espresso/intent/rule/IntentsTestRule;", "kotlin.jvm.PlatformType", "getIntentsTestRule", "()Landroidx/test/espresso/intent/rule/IntentsTestRule;", "test_HomeActivityInitialView", "", "test_navigateToDetailOnItemClickFromSearchResult", "test_showDataWhenSearchDoneWithValidName", "test_showEmptyLayoutWhenSearchDoneWithInvalidName", "app_debug"})
@dagger.hilt.android.testing.HiltAndroidTest()
@androidx.test.filters.LargeTest()
@org.junit.runner.RunWith(value = androidx.test.ext.junit.runners.AndroidJUnit4.class)
@dagger.hilt.android.testing.UninstallModules(value = {com.ms.starwars.di.module.UrlProviderModule.class})
public final class HomeActivityTest extends com.ms.starwars.ui.BaseActivityTest {
    @org.jetbrains.annotations.NotNull()
    private final androidx.test.ext.junit.rules.ActivityScenarioRule<com.ms.starwars.ui.home.HomeActivity> activityRule = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.test.espresso.intent.rule.IntentsTestRule<com.ms.starwars.ui.home.HomeActivity> intentsTestRule = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule()
    public final androidx.test.ext.junit.rules.ActivityScenarioRule<com.ms.starwars.ui.home.HomeActivity> getActivityRule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule()
    public final androidx.test.espresso.intent.rule.IntentsTestRule<com.ms.starwars.ui.home.HomeActivity> getIntentsTestRule() {
        return null;
    }
    
    @org.junit.Test()
    public final void test_HomeActivityInitialView() {
    }
    
    @org.junit.Test()
    public final void test_showDataWhenSearchDoneWithValidName() {
    }
    
    @org.junit.Test()
    public final void test_navigateToDetailOnItemClickFromSearchResult() {
    }
    
    @org.junit.Test()
    public final void test_showEmptyLayoutWhenSearchDoneWithInvalidName() {
    }
    
    public HomeActivityTest() {
        super();
    }
}