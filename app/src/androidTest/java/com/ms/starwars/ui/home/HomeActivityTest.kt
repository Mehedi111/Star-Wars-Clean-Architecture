package com.ms.starwars.ui.home

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.ms.starwars.R
import com.ms.starwars.di.module.UrlProviderModule
import com.ms.starwars.ui.BaseActivityTest
import com.ms.starwars.ui.adapters.SearchedCharacterAdapter
import com.ms.starwars.ui.details.DetailsActivity
import com.ms.starwars.utils.Constants.NO_MATCH_SEARCH_QUERY
import com.ms.starwars.utils.Constants.SEARCH_QUERY
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.UninstallModules
import org.hamcrest.Matchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@UninstallModules(UrlProviderModule::class)
@RunWith(AndroidJUnit4::class)
@LargeTest
@HiltAndroidTest
internal class HomeActivityTest : BaseActivityTest() {

    @get:Rule
    val activityRule: ActivityScenarioRule<HomeActivity> =
        ActivityScenarioRule(HomeActivity::class.java)

    @get:Rule
    val intentsTestRule = IntentsTestRule(HomeActivity::class.java)

    @Test
    fun test_HomeActivityInitialView() {
        onView(withId(R.id.search_edit_text))
            .check(matches(isDisplayed()))

        onView(withId(R.id.title))
            .check(matches(isDisplayed())).check(
                matches(withText(R.string.home_page_title))
            )
        onView(withId(R.id.search_result_rv))
            .check(matches(isDisplayed()))

    }

    @Test
    fun test_showDataWhenSearchDoneWithValidName() {
        onView(withId(R.id.search_edit_text))
            .perform(typeText(SEARCH_QUERY))
        onView(withId(R.id.search_result_rv))
            .check(matches(isDisplayed()))
        onView(withId(R.id.empty_layout))
            .check(matches(not(isDisplayed())))
    }

    @Test
    fun test_navigateToDetailOnItemClickFromSearchResult() {
        onView(withId(R.id.search_edit_text)).perform(typeText(SEARCH_QUERY))

        onView(withId(R.id.search_result_rv)).perform(
            RecyclerViewActions.actionOnItemAtPosition<SearchedCharacterAdapter.SearchedCharacterViewHolder>(
                0,
                ViewActions.click()
            )
        )

        intended(hasComponent(DetailsActivity::class.java.name))
    }

    @Test
    fun test_showEmptyLayoutWhenSearchDoneWithInvalidName() {
        onView(withId(R.id.search_edit_text)).perform(
            typeText(
                NO_MATCH_SEARCH_QUERY
            )
        )
        onView(withId(R.id.empty_layout))
            .check(matches(isDisplayed()))
    }


}