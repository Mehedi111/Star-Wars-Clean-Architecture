import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler

/**
 * Created by Mehedi Hasan on 1/23/2021.
 */

fun DependencyHandler.testImplementAll(list: List<String>) {
    list.forEach {
        add("testImplementation", it)
    }
}

fun DependencyHandler.androidTestImplementAll(list: List<String>) {
    list.forEach {
        add("androidTestImplementation", it)
    }
}

fun DependencyHandler.implementAll(list: List<String>) {
    list.forEach {
        add("implementation", it)
    }
}

fun DependencyHandler.implementApis(list: List<String>) {
    list.forEach {
        add("api", it)
    }
}

fun DependencyHandler.kapt(dependencyNotation: String): Dependency? =
    add("kapt", dependencyNotation)
