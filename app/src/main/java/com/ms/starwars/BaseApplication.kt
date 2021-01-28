package com.ms.starwars

import android.app.Application
import android.os.Build
import com.facebook.stetho.Stetho
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
@HiltAndroidApp
internal class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())

            if (!isRoboUnitTest()) {
                Stetho.initializeWithDefaults(this)
            }
    }

    private fun isRoboUnitTest(): Boolean {
        return "robolectric" == Build.FINGERPRINT
    }
}