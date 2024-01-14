import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.2.1"
	id("io.spring.dependency-management") version "1.1.4"
	id("com.avast.gradle.docker-compose") version "0.17.6"
	kotlin("jvm") version "1.9.21"
	kotlin("plugin.spring") version "1.9.21"
	kotlin("plugin.jpa") version "1.9.21"
	kotlin("plugin.allopen") version "1.8.0"
}

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

allOpen {
	annotation("jakarta.persistence.Entity")
	annotation("jakarta.persistence.Embeddable")
	annotation("jakarta.persistence.MappedSuperclass")
}

allprojects {

	group = "com.weplay"
	version = "0.0.1-SNAPSHOT"

	repositories {
		mavenCentral()
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs += "-Xjsr305=strict"
			jvmTarget = "17"
		}
	}

}

subprojects {

	apply(plugin = "org.springframework.boot")
	apply(plugin = "io.spring.dependency-management")
	apply(plugin = "org.jetbrains.kotlin.plugin.spring")
	apply(plugin = "docker-compose")

	apply(plugin = "kotlin")
	apply(plugin = "kotlin-spring")
	apply(plugin = "kotlin-jpa")
	apply(plugin = "kotlin-allopen")

	dockerCompose {
		useComposeFiles.add("../deploy/local/docker-compose.yaml")
		isRequiredBy(tasks.bootRun)
	}

	dependencyManagement {
		imports {
			mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
		}
	}
	dependencies {
		implementation("org.springframework.boot:spring-boot-starter-web")
		implementation("org.springframework.boot:spring-boot-starter-data-jpa")
		implementation("org.springframework.boot:spring-boot-starter-security")
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
		implementation("org.jetbrains.kotlin:kotlin-reflect")
		runtimeOnly("com.mysql:mysql-connector-j")
		testImplementation("org.springframework.boot:spring-boot-starter-test")
		testImplementation("io.kotest:kotest-runner-junit5:5.6.2")
		testImplementation("io.kotest.extensions:kotest-extensions-spring:1.1.3")
		testImplementation("io.kotest.extensions:kotest-extensions-testcontainers:2.0.2")
		testImplementation("org.testcontainers:testcontainers:1.18.3")
		testImplementation("org.testcontainers:mysql:1.18.3")
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}
}

project(":admin-api") {
	dependencies {
		implementation(project(":data-access"))
		testImplementation(project(":data-migration"))
	}
}

project(":data-access") {
	dependencies{
		testRuntimeOnly("com.h2database:h2")
	}
}

project(":data-migration") {
	dependencies {
		implementation(project(":data-access"))
		implementation("org.liquibase:liquibase-core")
	}
}
