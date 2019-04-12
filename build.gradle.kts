
plugins {
  id("org.jetbrains.kotlin.multiplatform") version "1.3.30"
}


tasks.withType<Wrapper> {
  distributionType = Wrapper.DistributionType.ALL
}


repositories {
  mavenCentral()
}


kotlin {
  mingwX64 {
    binaries {
      executable {
        entryPoint = "org.jonnyzzz.kotlin.mpp.template.main"
      }
    }
  }
}
