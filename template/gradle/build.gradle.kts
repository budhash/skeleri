@Suppress("DSL_SCOPE_VIOLATION")

plugins {
//    id("com.diffplug.spotless") version "6.4.1"
    alias(libs.plugins.kotlin.jvm) apply false
    idea
}

subprojects {
//    plugins.apply("com.diffplug.spotless")
//    spotless {
//        kotlin {
//            target("**/*.kt")
//            targetExclude("$buildDir/**/*.kt", "bin/**/*.kt", "**/protobuf/**/*.kt")
//            ktlint("0.45.1")
//        }
//
//        kotlinGradle {
//            target("*.gradle.kts")
//            ktlint("0.45.1")
//        }
//    }
}
