package com.ms.starwars.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
abstract class BaseViewModel : ViewModel() {

    protected fun launchCoroutine(
        coroutineExceptionHandler: CoroutineExceptionHandler,
        callback: suspend CoroutineScope.() -> Unit
    ): Job {
        // Only for network I/O we don't need to use Dispatchers.IO scheduler
        // because Retrofit does that(since Retrofit 2.6.0).
        return viewModelScope.launch(coroutineExceptionHandler) {
            callback()
        }
    }
}