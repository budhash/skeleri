@Suppress("DSL_SCOPE_VIOLATION")

plugins {
    application
    idea
    alias(libs.plugins.kotlin.jvm) apply true
}

group = "${PROJ_GROUP}"
version = "0.0.1-SNAPSHOT"

application {
    mainClass.set("${PROJ_GROUP}.MainKt")
    applicationName = rootProject.name
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.bundles.testj)
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

tasks.withType<Jar> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    manifest {
        attributes["Main-Class"] = application.mainClass
        archiveFileName.set("${project.name}.jar")
    }
    from(configurations.compileClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    exclude("META-INF/*.SF")
    exclude("META-INF/*.DSA")
}
