import java.net.URI

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }

    plugins {
        id("com.android.application") version "9.0.1"
        id("com.android.library") version "9.0.1"
        kotlin("android") version "2.2.20"
        kotlin("plugin.serialization") version "2.2.20"
        id("org.jetbrains.kotlin.plugin.compose") version "2.2.20"
    }

}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = URI("https://jitpack.io") }
    }
}

rootProject.name = "LiveKit Agents Example"
include(":app")
