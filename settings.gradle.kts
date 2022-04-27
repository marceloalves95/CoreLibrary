rootProject.name = "CoreLibrary"
include(":components")
include(":testing")
include(":compose")

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
    }
}

includeBuild("includedBuilds/build-configuration")
includeBuild("includedBuilds/build-source")

