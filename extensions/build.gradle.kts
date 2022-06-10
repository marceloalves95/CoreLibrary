import extensions.mavenPublishLocal

plugins {
    id("extensions-library-plugin")
    id("maven-publish")
}

mavenPublishLocal(
    groupId = "br.com.core",
    artifactId = "extensions",
    version = "1.0.0"
)