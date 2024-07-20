// Use IntelliJ Platform Gradle Plugin snapshot repository
pluginManagement {
    repositories {
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "examplecreatetemplate"



//buildCache {
//    remote<HttpBuildCache> {
//        url = uri("http://10.1.1:8123/cache/")
//        credentials {
//            username = "josh"
//            password = "Taylor99!"
//        }
//    }
//}
//
