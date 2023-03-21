
pluginManagement {
    includeBuild("build-logic")
    repositories {
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://plugins.gradle.org/m2/")
        maven("https://jitpack.io")
        gradlePluginPortal()
        mavenCentral()
        jcenter()
        google()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://plugins.gradle.org/m2/")
        maven("https://jitpack.io")
        gradlePluginPortal()
        mavenCentral()
        jcenter()
        google()
    }
}
rootProject.name = "MobileX"
// KTX
include(":ktx-core")
// DI
include(":service-locator")
include(":paging")
// Adapter
include(":rvadapter")
