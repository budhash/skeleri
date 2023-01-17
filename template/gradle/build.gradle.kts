// version catalog : `gradle/libs.versions.toml`

@Suppress("DSL_SCOPE_VIOLATION")

plugins {
    application
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.gradle.versions)
    alias(libs.plugins.gradle.versions.update)
}

group = "${PROJ_GROUP}"
version = "0.0.1-SNAPSHOT"

// use JUnit 5
tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("${PROJ_GROUP}.MainKt")
}

/*
tasks {
    val libs = rootDir.resolve("gradle/libs.versions.toml").reader().use { java.util.Properties().apply { load(it) } }

    val kotlinVersion = libs.getProperty("kotlin").removeSurrounding("\"")


    plugins {
        kotlin("multiplatform") version kotlinVersion
    }

    val jvmTarget = "1.8"

    // Configure JVM versions
    compileKotlin {
        kotlinOptions.jvmTarget = jvmTarget
        kotlinOptions.languageVersion = "1.7"
        kotlinOptions.freeCompilerArgs += listOf(
            "-opt-in=kotlin.RequiresOptIn"
        )
    }
    compileJava {
        targetCompatibility = jvmTarget
        sourceCompatibility = jvmTarget
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
*/
