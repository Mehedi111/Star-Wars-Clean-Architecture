/**
 * Created by Mehedi Hasan on 1/23/2021.
 */

object SettingDependency {
    const val gradle_plugin = "com.android.tools.build:gradle:${Dependencies.Versions.gradleVersion}"
    const val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Dependencies.Versions.kotlinVersion}"
    const val about_library_plugin =  "com.mikepenz.aboutlibraries.plugin:aboutlibraries-plugin:${Dependencies.Versions.aboutLibraries}"
    const val hilt_plugin = "com.google.dagger:hilt-android-gradle-plugin:${Dependencies.Versions.daggerPluginVersion}"
}