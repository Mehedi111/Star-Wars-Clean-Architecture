plugins {
    id("java-library")
    id("kotlin")
    id("kotlin-kapt")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

sourceSets.getByName("main") {
    java.srcDir("src/main/java")
}
sourceSets.getByName("test") {
    java.srcDir("src/test/kotlin")
}

dependencies {
    implementation(project(":domain"))
    implementApis(Data.components)
    testImplementAll(Data.Test.testComponentsComponents)
}