plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

group = "com.corelibrary.gradle"
version = "1.0.0"

gradlePlugin {
    plugins {
        register("core-library-gradle-plugin") {
            id = "core-library-gradle-plugin"
            implementationClass = "CoreLibraryGradlePlugin"
        }

    }
}