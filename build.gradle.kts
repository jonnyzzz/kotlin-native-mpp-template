plugins {
  kotlin("jvm") version "1.3.30"
  application
}

repositories {
  jcenter()
  mavenCentral()
}

val ktorVersion = "1.1.3"
dependencies {
  implementation(kotlin("stdlib"))

  implementation("io.ktor:ktor-server-netty:$ktorVersion")
  implementation("io.ktor:ktor-html-builder:$ktorVersion")
  implementation("io.ktor:ktor-locations:$ktorVersion")
  implementation("io.ktor:ktor-jackson:$ktorVersion")
  implementation("org.slf4j:slf4j-simple:1.7.26")

  testImplementation("junit:junit:4.12")
  testImplementation("io.ktor:ktor-server-test-host:$ktorVersion")
}

application {
  mainClassName = "org.jonnyzzz.template.jvm.MainKt"
}

