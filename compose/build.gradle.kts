import extensions.mavenPublishLocal

plugins {
    id("compose-library-plugin")
    id("maven-publish")
}

mavenPublishLocal(
    groupId = "br.com.core",
    artifactId = "compose",
    version = "1.0.0"
)

