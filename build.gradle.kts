plugins {
    kotlin("jvm") version "1.3.72"
    application
}

group = "clumzywizard"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.6.2")
    testImplementation("org.assertj:assertj-core:3.16.1")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "11"
    }
}

application {
    mainClassName = "clumsywizard.happynum.ApplicationKt"
}
