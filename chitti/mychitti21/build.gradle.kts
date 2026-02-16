// Root-level build.gradle.kts

plugins {
    // These should match the versions declared in settings.gradle.kts
    id("com.android.application") version "9.0.1" apply false
    id("com.android.library") version "9.0.1" apply false
    kotlin("android") version "2.2.20" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
