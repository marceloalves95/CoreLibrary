import extensions.*
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

/**
 * @author RubioAlves
 * Created 27/04/2022 at 07:10
 */
class ComponentsPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        with(project) {
            applyPlugins()
            applyAndroid()
            applyDependencies()
        }
    }

    private fun Project.applyDependencies() {
        dependencies {
            kotlin()
            material()
            navigation()
            viewBinding()
            lifecycle()
            glide()
            shimmer()
        }
    }
}