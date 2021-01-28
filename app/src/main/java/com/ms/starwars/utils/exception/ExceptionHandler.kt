package com.ms.starwars.utils.exception

import androidx.annotation.StringRes
import com.ms.starwars.R
import java.io.IOException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
internal object ExceptionHandler {
    /**
     * Returns a readable error message from Throwable object
     * @param t       throwable object
     * @return error message
     */
    @StringRes
    fun parse(t: Throwable): Int {
        return when (t) {
            is SocketTimeoutException -> {
                // Connection timeout
                R.string.error_timeout
            }
            is UnknownHostException -> {
                // Remote host is currently unreachable
                R.string.error_unable_to_reach
            }
            is IOException -> {
                // A conversion error happened
                R.string.error_data_conversion
            }
            else -> {
                R.string.error_unknown
            }
        }

    }
}