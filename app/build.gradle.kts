
plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("com.mikepenz.aboutlibraries.plugin")
    id("dagger.hilt.android.plugin")
    id("org.jetbrains.kotlin.android.extensions")
}

android {
    compileSdkVersion(Version.compileSdkVersion)
    buildToolsVersion(Version.buildToolsVersion)

    defaultConfig {
        applicationId = Android.applicationId
        minSdkVersion(Version.minSdkVersion)
        targetSdkVersion(Version.targetSdkVersion)
        versionCode = Version.versionCode
        versionName = Version.versionName
        multiDexEnabled = true


        testInstrumentationRunner = Android.testInstrumentationRunner
    }

    buildTypes {
        named(BuildType.DEBUG) {
            minifyEnabled(false)
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    testOptions.unitTests {
        isIncludeAndroidResources = true
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    sourceSets.getByName("main") {
        java.srcDir("src/main/java")
    }
    sourceSets.getByName("test") {
        java.srcDir("src/test/java")
    }
    sourceSets.getByName("androidTest") {
        java.srcDir("src/androidTest/java")
    }
}

dependencies {

    //Local Libs
    implementation(project(":domain"))
    implementation(project(":data"))


    //all libraries
    implementAll(Presentation.components)

    //dagger kapt
    kapt(DI.Kapt.daggerKapt)
    kapt(DI.Kapt.daggerCompiler)

    //test libraries
    testImplementAll(TestDependencies.components)

    //android test
    androidTestImplementAll(AndroidTestDependencies.components)
    implementation(AndroidTestDependencies.espressoIdlingResource)
    kaptAndroidTest(AndroidTestDependencies.kaptHiltAndroidTest)

}

