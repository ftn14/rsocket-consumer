group = "com.ftx.h1.outside"
version = "1.0-SNAPSHOT"

plugins {
    id("org.springframework.boot") version "2.2.5.RELEASE"
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
    kotlin("jvm") version "1.3.72"
    kotlin("plugin.spring") version "1.3.72"
}

repositories {
    mavenCentral()
    maven(url = "https://repo.spring.io/milestone")
}

val kotlinCoroutinesVersion = "1.3.7"

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinCoroutinesVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:$kotlinCoroutinesVersion")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.springframework.boot:spring-boot-starter-rsocket")
    implementation("io.github.microutils:kotlin-logging:1.7.9")

    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude("org.junit.vintage", "junit-vintage-engine")
    }
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:$kotlinCoroutinesVersion")
    testImplementation("io.projectreactor:reactor-test")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}