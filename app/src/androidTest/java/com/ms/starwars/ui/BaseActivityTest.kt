package com.ms.starwars.ui

import androidx.test.espresso.IdlingRegistry
import com.ms.starwars.utils.RequestDispatcher
import com.ms.starwars.utils.idlingResource.EspressoIdlingResource
import dagger.hilt.android.testing.HiltAndroidRule
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Rule

open class BaseActivityTest {

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    private lateinit var mockWebServer: MockWebServer

    @Before
    open fun setup() {
        hiltRule.inject()
        mockWebServer = MockWebServer()
        mockWebServer.dispatcher = RequestDispatcher()
        mockWebServer.start(8080)
        IdlingRegistry.getInstance().register(EspressoIdlingResource.countingIdlingResource)

    }

    @After
    open fun tearDown() {
        mockWebServer.shutdown()
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.countingIdlingResource)
    }

}