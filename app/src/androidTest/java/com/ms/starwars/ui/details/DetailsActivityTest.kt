package com.ms.starwars.ui.details

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.ms.starwars.Constants
import com.ms.starwars.R
import com.ms.starwars.di.module.UrlProviderModule
import com.ms.starwars.ui.BaseActivityTest
import com.ms.starwars.utils.DummyData
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.UninstallModules
import org.junit.After
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@UninstallModules(UrlProviderModule::class)
@RunWith(AndroidJUnit4::class)
@HiltAndroidTest
internal class DetailsActivityTest : BaseActivityTest() {

    @get:Rule
    var activityRule: ActivityTestRule<DetailsActivity> =
        ActivityTestRule(DetailsActivity::class.java, false, false)


    @Test
    fun test_snackBarWithErrorMessageIfParcelIsNull() {
        val intent = Intent()
        activityRule.launchActivity(intent)

        onView(withId(R.id.snackbar_text))
            .check(matches(isDisplayed()))
            .check(matches(withText(R.string.error_loading_character_details)))
    }

    @Test
    fun test_profileViewWithValidCharacterEntity() {
        val intent = Intent().apply {
            putExtra(Constants.PARCEL_KEY_CHAR, DummyData.characterEntity)
        }
        activityRule.launchActivity(intent)

        onView(withId(R.id.snackbar_text))
            .check(doesNotExist())

        onView(withId(R.id.name_tv)).check(matches(isDisplayed()))
        onView(withId(R.id.height_tv)).check(matches(isDisplayed()))

    }

    @After
    override fun tearDown() {
        super.tearDown()
        activityRule.finishActivity()
    }

}