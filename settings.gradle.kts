pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "folia"

include("folia-api")
include("folia-server")
include("folia-checkstyle")

gradle.lifecycle.beforeProject {
    val mcVersion = providers.gradleProperty("mcVersion").get().trim()
    val forkVersion = providers.gradleProperty("forkVersion").get().trim()
    val foliaVersionChannel = providers.gradleProperty("channel").get().trim()
    val versionChannel = foliaVersionChannel.lowercase()
    val foliaBuildNumber = providers.environmentVariable("BUILD_NUMBER").orNull?.trim()?.toInt()
    val versionString = if (foliaBuildNumber == null) {
        "$forkVersion-mc$mcVersion.local-SNAPSHOT"
    } else {
        "$forkVersion-mc$mcVersion.build.$foliaBuildNumber-$versionChannel"
    }
    version = versionString
}
