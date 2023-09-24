plugins {
    kotlin("multiplatform") version "1.9.10"
    id("org.jmailen.kotlinter") version "3.16.0"
    id("io.gitlab.arturbosch.detekt") version "1.23.1"
}

group = "com.rjspies"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    macosX64("native") {
        binaries {
            executable("profilr") {
                entryPoint = "main"
            }
        }
    }

    sourceSets {
        getByName("nativeMain") {
            dependencies {
                implementation(kotlin("test"))
                implementation("org.jetbrains.kotlinx:kotlinx-cli:0.3.6")
                implementation("com.mohamedrejeb.ksoup:ksoup-html:0.2.1")
                implementation("com.squareup.okio:okio:3.5.0")
            }
        }
    }
}
