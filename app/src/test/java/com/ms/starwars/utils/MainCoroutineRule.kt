package com.ms.starwars.utils

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.TestCoroutineScope
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.rules.TestWatcher
import org.junit.runner.Description


/**
 * @see TestCoroutineDispatcher performs both immediate and lazy execution of coroutines in tests.
 * @see TestWatcher this class will keep a log of each
 * passing and failing test
 * @see TestCoroutineScope provides detailed control over the execution of coroutines for tests.
 */
@ExperimentalCoroutinesApi
class MainCoroutineRule(
    val dispatcher: TestCoroutineDispatcher = TestCoroutineDispatcher()
) : TestWatcher() {

    /**
     * Set the [dispatcher] as an underlying dispatcher of [Dispatchers.Main]
     */
    override fun starting(description: Description) {
        super.starting(description)
        Dispatchers.setMain(dispatcher)
    }


    /**
     *  Resets state of the [Dispatchers.Main] to the original main dispatcher
     */
    override fun finished(description: Description) {
        super.finished(description)
        Dispatchers.resetMain()
        dispatcher.cleanupTestCoroutines()
    }
}