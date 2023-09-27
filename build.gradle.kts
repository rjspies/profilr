plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlinter)
    alias(libs.plugins.detekt)
}

group = libs.versions.groupName
version = libs.versions.profilr

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
                implementation(libs.kotlinTest)
                implementation(libs.kotlinxCli)
            }
        }
    }
}

tasks.register("version") {
    group = "versioning"
    doLast {
        logger.quiet(libs.versions.profilr.get())
    }
}
