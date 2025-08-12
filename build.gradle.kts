import net.fabricmc.loom.api.LoomGradleExtensionAPI

plugins {
    id("fabric-loom") version "1.2.17"
    id("java")
    id("maven-publish")
}

val minecraftVersion = "1.21.1"
val yarnMappings = "25.1.45"
val loaderVersion = "0.14.13"
val fabricApiVersion = "0.90.0+1.21.1"

repositories {
    mavenCentral()
    maven { url = uri("https://maven.fabricmc.net/") }
}

dependencies {
    minecraft("com.mojang:minecraft:${'$'}{minecraftVersion}")
    mappings("net.fabricmc:yarn:${'$'}{yarnMappings}:v2")
    modImplementation("net.fabricmc:fabric-loader:${'$'}{loaderVersion}")
    modImplementation("net.fabricmc.fabric-api:fabric-api:${'$'}{fabricApiVersion}")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.processResources {
    inputs.property("version", project.version)
}

