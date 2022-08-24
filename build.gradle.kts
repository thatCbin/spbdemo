import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    val kotlin_version = "1.7.10"
    id("org.springframework.boot") version "2.7.2"
    id("io.spring.dependency-management") version "1.0.12.RELEASE"

    kotlin("plugin.jpa") version kotlin_version//Kotlin JPA 插件
    kotlin("jvm") version kotlin_version
    kotlin("plugin.spring") version kotlin_version
}

group = "com.cbin"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11


dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-mustache")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")//增加对 Kotlin 类和数据类的序列化/反序列化的支持
    implementation("org.jetbrains.kotlin:kotlin-reflect")  //Kotlin 反射库
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    developmentOnly("com.h2database:h2")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}


tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
