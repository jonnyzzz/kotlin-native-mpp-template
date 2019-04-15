plugins {
  kotlin("jvm") version "1.3.30"
  `application`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation(kotlin("stdlib"))
}

application {
  mainClassName = "org.jonnyzzz.template.jvm.MainKt"
}

