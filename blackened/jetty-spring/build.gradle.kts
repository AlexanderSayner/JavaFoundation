import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("war")
    kotlin("jvm") version "1.3.72"
}

group = "org.sayner.sandbox.example.jetty"
version = "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

val servletApiVersion = "4.0.1"
val jstlVersion = "1.2"
val springFrameworkVersion = "5.2.8.RELEASE"
val jacksonVersion="2.11.1"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    providedCompile("javax.servlet:javax.servlet-api:${servletApiVersion}")
    implementation("javax.servlet.jsp.jstl:jstl-api:${jstlVersion}")
    implementation("org.springframework:spring-webmvc:${springFrameworkVersion}")
    implementation("com.fasterxml.jackson.core:jackson-databind:${jacksonVersion}")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}
