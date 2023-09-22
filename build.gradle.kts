plugins {
    kotlin("jvm") version "1.9.10"
    id("org.jmailen.kotlinter") version "3.16.0"
}

group = "com.rjspies"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}
