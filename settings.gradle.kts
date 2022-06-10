rootProject.name = "CoreLibrary"
include(":components")
include(":testing")
include(":compose")
include(":extensions")

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
    }
}

includeBuild("includedBuilds/build-configuration")
includeBuild("includedBuilds/build-source")


