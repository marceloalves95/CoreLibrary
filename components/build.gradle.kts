import extensions.mavenPublishLocal

plugins {
    id("components-library-plugin")
    id("maven-publish")
}

mavenPublishLocal(
    groupId = "br.com.core",
    artifactId = "components",
    version = "1.0.0"
)

