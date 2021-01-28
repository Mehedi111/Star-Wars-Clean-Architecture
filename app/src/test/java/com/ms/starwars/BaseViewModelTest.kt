package com.ms.starwars

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.ms.starwars.utils.MainCoroutineRule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineScope
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Rule

@ExperimentalCoroutinesApi
abstract class BaseViewModelTest {
    /**
     * A JUnit Test Rules that swaps the background executor used by the Architecture Components with a
     * different one which executes each task synchronously.
     */
    @get:Rule
    open val instantTaskExecutorRule = InstantTaskExecutorRule()

    /**
     *  Custom coroutine rule for test purposes
     */
    @ExperimentalCoroutinesApi
    @get:Rule
    open val mainCoroutineRule = MainCoroutineRule()


    protected fun launchBlockingTest(block: TestCoroutineScope.() -> Unit) {
        mainCoroutineRule.dispatcher.runBlockingTest {
            block()
        }
    }
}