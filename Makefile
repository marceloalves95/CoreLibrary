publish-local:
	./gradlew components:publishToMavenLocal
	./gradlew testing:publishToMavenLocal
	./gradlew compose:publishToMavenLocal
	./gradlew extensions:publishToMavenLocal