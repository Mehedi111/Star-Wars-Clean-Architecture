import DI.daggerAndroid
import DI.daggerViewModel
import Dependencies.Versions.aboutLibsVersion
import Dependencies.Versions.activityKTXVersion
import Dependencies.Versions.androidxCoreKtxVersion
import Dependencies.Versions.androidxJunitVersion
import Dependencies.Versions.androidxTestCoreVersion
import Dependencies.Versions.appcompatVersion
import Dependencies.Versions.archComponentTestVersion
import Dependencies.Versions.constraintLayoutVersion
import Dependencies.Versions.coroutinesCoreVersion
import Dependencies.Versions.daggerCompilerVersion
import Dependencies.Versions.daggerPluginVersion
import Dependencies.Versions.espressoVersion
import Dependencies.Versions.fragmentKtxVersion
import Dependencies.Versions.junitVersion
import Dependencies.Versions.kotlinVersion
import Dependencies.Versions.lifecycleExtensionsVersion
import Dependencies.Versions.loggingInterceptorVersion
import Dependencies.Versions.materialVersion
import Dependencies.Versions.mockWebServerVersion
import Dependencies.Versions.moshiConverterVersion
import Dependencies.Versions.recyclerviewAnimationVersion
import Dependencies.Versions.retrofitVersion
import Dependencies.Versions.robolectricVersion
import Dependencies.Versions.rulesVersion
import Dependencies.Versions.runnerVersion
import Dependencies.Versions.stethoVersion
import Dependencies.Versions.supportV4Version
import Dependencies.Versions.timberVersion
import Dependencies.Versions.truthVersion

object Version {
    const val minSdkVersion: Int = 21
    const val compileSdkVersion: Int = 29
    const val buildToolsVersion: String = "29.0.3"
    const val targetSdkVersion: Int = 29
    const val versionName: String = "1.0"
    const val versionCode: Int = 1
}

object Android {
    const val applicationId: String = "com.ms.starwars"
    const val testInstrumentationRunner: String = "com.ms.starwars.HiltTestRunner"
}


object Dependencies {
    object Versions {

        // Kotlin
        const val kotlinVersion = "1.4.21"

        //gradle
        const val gradleVersion = "4.1.1"
        const val aboutLibraries = "8.1.2"


        // Dependencies Version - Presentation
        const val appcompatVersion = "1.2.0"
        const val androidxCoreKtxVersion = "1.3.2"
        const val constraintLayoutVersion = "2.0.4"
        const val supportV4Version = "1.0.0"
        const val materialVersion = "1.2.1"
        const val fragmentKtxVersion = "1.1.0"
        const val lifecycleExtensionsVersion = "2.1.0"
        const val recyclerviewAnimationVersion = "3.0.0"
        const val aboutLibsVersion = "8.0.0-rc01"
        const val stethoVersion = "1.5.1"
        const val timberVersion = "4.7.1"
        const val activityKTXVersion = "1.1.0"

        //dagger hilt
        const val daggerPluginVersion = "2.28-alpha"
        const val daggerCompilerVersion = "1.0.0-alpha01"

        // Data
        const val retrofitVersion = "2.7.0"
        const val moshiConverterVersion = "2.7.0"
        const val loggingInterceptorVersion = "4.2.1"

        // Domain
        const val coroutinesCoreVersion = "1.3.6"

        // Testing
        const val junitVersion = "4.12"
        const val espressoVersion = "3.2.0"
        const val androidxJunitVersion = "1.1.1"
        const val truthVersion = "1.0"
        const val mockWebServerVersion = "4.2.1"
        const val robolectricVersion = "4.3"
        const val androidxTestCoreVersion = "1.0.0"
        const val runnerVersion = "1.2.0"
        const val rulesVersion = "1.2.0"
        const val archComponentTestVersion = "2.1.0"
    }
}

interface Libraries {
    val components: List<String>
}

object DI {
    //dagger
    const val daggerAndroid = "com.google.dagger:hilt-android:$daggerPluginVersion"
    const val daggerViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:$daggerCompilerVersion"


    object Kapt {
        const val daggerKapt = "com.google.dagger:hilt-android-compiler:$daggerPluginVersion"
        const val daggerCompiler = "androidx.hilt:hilt-compiler:$daggerCompilerVersion"
    }
}

object Presentation : Libraries {
    const val appCompat = "androidx.appcompat:appcompat:$appcompatVersion"
    const val androidxKtx = "androidx.core:core-ktx:$androidxCoreKtxVersion"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
    const val supportV4 = "androidx.legacy:legacy-support-v4:$supportV4Version"
    const val material = "com.google.android.material:material:$materialVersion"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:$fragmentKtxVersion"
    const val lifecycleExtensions =
        "androidx.lifecycle:lifecycle-extensions:$lifecycleExtensionsVersion"
    const val recyclerviewAnimations =
        "jp.wasabeef:recyclerview-animators:$recyclerviewAnimationVersion"

    const val aboutLibraryCore = "com.mikepenz:aboutlibraries-core:$aboutLibsVersion"
    const val aboutLibraryUi = "com.mikepenz:aboutlibraries:$aboutLibsVersion"
    const val stetho = "com.facebook.stetho:stetho:$stethoVersion"
    const val timber = "com.jakewharton.timber:timber:$timberVersion"
    const val activityKTX = "androidx.activity:activity-ktx:$activityKTXVersion"

    const val consrypty = "org.conscrypt:conscrypt-android:2.2.1"

    override val components: List<String>
        get() = listOf(
            appCompat,
            androidxKtx,
            constraintLayout,
            supportV4,
            material,
            activityKTX,
            fragmentKtx,
            lifecycleExtensions,
            recyclerviewAnimations,
            aboutLibraryCore,
            aboutLibraryUi,
            stetho,
            consrypty,
            daggerAndroid,
            daggerViewModel,
            timber
        )


}

object Data : Libraries {
    const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
    const val moshiConverter = "com.squareup.retrofit2:converter-moshi:$moshiConverterVersion"
    const val loggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:$loggingInterceptorVersion"

    object Test {
        val testComponentsComponents: List<String>
            get() = listOf(
                TestDependencies.junit,
                TestDependencies.googleTruth,
                AndroidTestDependencies.mockWebServer
            )
    }

    override val components: List<String>
        get() = listOf(
            retrofit, moshiConverter, loggingInterceptor
        )


}

object Domain : Libraries {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesCoreVersion"

    override val components: List<String>
        get() = listOf(
            kotlin, coroutinesCore
        )
}


object TestDependencies : Libraries {
    const val junit = "junit:junit:$junitVersion"
    const val robolectric = "org.robolectric:robolectric:$robolectricVersion"
    const val androidxJunit = "androidx.test.ext:junit:$androidxJunitVersion"
    const val espressoCore = "androidx.test.espresso:espresso-core:$espressoVersion"
    const val runner = "androidx.test:runner:$runnerVersion"
    const val rules = "androidx.test:rules:$rulesVersion"
    const val googleTruth = "com.google.truth:truth:$truthVersion"
    const val archComponentTest = "androidx.arch.core:core-testing:$archComponentTestVersion"
    const val coroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesCoreVersion"

    override val components: List<String>
        get() = listOf(
            junit,
            androidxJunit,
            espressoCore,
            googleTruth,
            robolectric,
            runner,
            rules,
            archComponentTest,
            coroutinesTest
        )
}

object AndroidTestDependencies : Libraries {
    const val androidxJunit = "androidx.test.ext:junit:$androidxJunitVersion"
    const val runner = "androidx.test:runner:$runnerVersion"
    const val rules = "androidx.test:rules:$rulesVersion"
    const val espressoCore = "androidx.test.espresso:espresso-core:$espressoVersion"
    const val espressoIntents = "androidx.test.espresso:espresso-intents:$espressoVersion"
    const val espressoContrib = "androidx.test.espresso:espresso-contrib:$espressoVersion"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:$mockWebServerVersion"
    const val androidxCoreTest = "androidx.test:core:$androidxTestCoreVersion"
    const val hiltTesting: String =
        "com.google.dagger:hilt-android-testing:$daggerPluginVersion"
    const val kaptHiltAndroidTest: String =
        "com.google.dagger:hilt-android-compiler:$daggerPluginVersion"


    const val espressoIdlingResource =
        "androidx.test.espresso:espresso-idling-resource:$espressoVersion"

    override val components: List<String>
        get() = listOf(
            androidxJunit,
            runner,
            rules,
            espressoContrib,
            espressoCore,
            espressoIntents,
            mockWebServer,
            hiltTesting,
            androidxCoreTest
        )


}
