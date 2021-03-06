import extensions.mavenPublishLocal

plugins {
    id("testing-library-plugin")
    id("maven-publish")
}

mavenPublishLocal(
    groupId = "br.com.core",
    artifactId = "testing",
    version = "1.0.0"
)
