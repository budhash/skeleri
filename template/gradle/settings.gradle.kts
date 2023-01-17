@file: Suppress("UnstableApiUsage", "LocalVariableName")

import org.gradle.api.initialization.resolve.RepositoriesMode.FAIL_ON_PROJECT_REPOS

rootProject.name = "${PROJ_NAME}"

enableFeaturePreview("VERSION_CATALOGS")

include(
    ":${PROJ_NAME}"
)

pluginManagement {
    repositories {
        mavenCentral()
        mavenLocal()
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
        google()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        mavenLocal()
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
        google()
    }

    // don't allow projects to declare their own sources
    repositoriesMode.set(FAIL_ON_PROJECT_REPOS)
}

// https://github.com/gradle/gradle/blob/master/subprojects/docs/src/docs/userguide/running-builds/configuration_cache.adoc#stable-configuration-cache
enableFeaturePreview("STABLE_CONFIGURATION_CACHE")