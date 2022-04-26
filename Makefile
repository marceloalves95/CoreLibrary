publish-local:
	./gradlew components:publishToMavenLocal
	./gradlew testing:publishToMavenLocal