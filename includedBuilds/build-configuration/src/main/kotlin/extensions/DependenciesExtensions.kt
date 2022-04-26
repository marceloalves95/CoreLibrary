package extensions

import org.gradle.kotlin.dsl.DependencyHandlerScope

/**
 * @author RubioAlves
 * Created 24/04/2022 at 14:15
 */

fun DependencyHandlerScope.myDependencies(){
    material()
    navigation()
    viewBinding()
    lifecycle()
    networking()
    glide()
    shimmer()
    koin()
    mockk()
    room()
}
fun DependencyHandlerScope.myTestsDependencies(){
    junit()
    espresso()
    mockkTest()
    roomTest()
}
fun DependencyHandlerScope.gradleDependencies(){
    "implementation"(Dependencies.gradle)
    "implementation"(Dependencies.kotlin_gradle)
    "implementation"(Dependencies.core_gradle_plugin)
}
fun DependencyHandlerScope.kotlin(){
    "implementation"(Dependencies.kotlin)
    "implementation"(Dependencies.kotlin_jdk)
}
fun DependencyHandlerScope.material(){
    "implementation"(Dependencies.core_ktx)
    "implementation"(Dependencies.appcompat)
    "implementation"(Dependencies.material)
    "implementation"(Dependencies.constraint_layout)
}
fun DependencyHandlerScope.navigation(){
    "implementation"(Dependencies.navigation_ui)
    "implementation"(Dependencies.navigation_fragment)
}
fun DependencyHandlerScope.viewBinding(){
    "implementation"(Dependencies.view_binding)
}
fun DependencyHandlerScope.lifecycle(){
    "implementation"(Dependencies.lifecycle_runtime)
    "implementation"(Dependencies.lifecycle_livedata)
    "implementation"(Dependencies.lifecycle_viewmodel)
}
fun DependencyHandlerScope.networking(){
    "implementation"(Dependencies.retrofit)
    "implementation"(Dependencies.converter_gson)
    "implementation"(Dependencies.okhttp3_logging_interceptor)
}
fun DependencyHandlerScope.glide(){
    "annotationProcessor"(Dependencies.glide_compiler)
    "implementation"(Dependencies.glide)
}
fun DependencyHandlerScope.shimmer(){
    "implementation"(Dependencies.facebook_shimmer)
}
fun DependencyHandlerScope.koin(){
    "implementation"(Dependencies.koin)
    "implementation"(Dependencies.koin_test)
}
fun DependencyHandlerScope.mockk(){
    "implementation"(Dependencies.mockk)
}
fun DependencyHandlerScope.room(){
    "annotationProcessor"(Dependencies.room)
    "implementation"(Dependencies.room_kts)
    "implementation"(Dependencies.room_runtime)
}
fun DependencyHandlerScope.junit(){
    "testImplementation"(Dependencies.junit)
    "androidTestImplementation"(Dependencies.ext_junit)
}
fun DependencyHandlerScope.espresso(){
    "androidTestImplementation"(Dependencies.espresso_core)
}
fun DependencyHandlerScope.mockkTest(){
    "testImplementation"(Dependencies.mockk)
    "androidTestImplementation"(Dependencies.mockk_android)
}
fun DependencyHandlerScope.roomTest(){
    "testImplementation"(Dependencies.room_testing)
}
