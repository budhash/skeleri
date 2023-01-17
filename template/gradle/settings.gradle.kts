@file: Suppress("UnstableApiUsage", "LocalVariableName")

import org.gradle.api.initialization.resolve.RepositoriesMode.FAIL_ON_PROJECT_REPOS

rootProject.name = "${PROJ_NAME}"

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
