# **CoreLibrary**

> *Esse projeto tem como objetivo centralizar muitos códigos que são usados em outros projetos.*

#### Instalação
Se você deseja executar essa library execute o arquivo **Makefile** ou digite os seguintes comandos no seu terminal:

````
//Exemplo: ./gradlew modulo_que_vc_quer_usar:publishToMavenLocal
./gradlew components:publishToMavenLocal
./gradlew testing:publishToMavenLocal
./gradlew compose:publishToMavenLocal
````

#### Instalação do CoreLibrary no seu projeto

No `build.gradle.kts`do seu projeto adicione no `repository`a seguinte linha:

````
mavenLocal()
````

E no `build.gradle.kts` do seu aplicativo(app) adicione nos `dependencies`a seguinte linha:
````kotlin
implementation("br.com.core.components:components:1.0.0")
implementation("br.com.core.testing:testing:1.0.0")
implementation("br.com.core.compose:compose:1.0.0")
````
