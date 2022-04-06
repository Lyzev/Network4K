import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.20"
    id("com.github.johnrengelman.shadow") version "7.1.2"
    id("maven-publish")
    id("org.jetbrains.dokka") version "1.6.10"
}

operator fun Project.get(property: String): String = property(property) as String

group = "me.lyzev.network"
version = "1.3"

repositories {
    mavenCentral()
}

tasks.getByName<DokkaTask>("dokkaHtml") {
    outputDirectory.set(buildDir.resolve("dokkaHtmlOutput"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "16"
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "me.lyzev.network"
            artifactId = "Network4K"
            version = "1.3"

            from(components["java"])
        }
    }
}

apply(plugin = "maven-publish")

buildscript {
    repositories {
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
    dependencies {
        classpath("gradle.plugin.com.github.johnrengelman:shadow:7.1.2")
    }
}

apply(plugin = "com.github.johnrengelman.shadow")