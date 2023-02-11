import com.makeevrserg.mobilex.MobileXApk
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.named
import org.gradle.kotlin.dsl.project

plugins {
    kotlin("multiplatform")
    id("com.android.library")
}
group = libs.versions.group.get()
version = libs.versions.version.get()

kotlin {
    android {
        publishLibraryVariants("release", "debug")
    }
    sourceSets{
        val androidMain by getting
    }
}
android {
    compileSdk = MobileXApk.COMPILE_SDK_VERSION

    defaultConfig {
        minSdk = MobileXApk.MIN_SDK_VERSION
        targetSdk = MobileXApk.TARGET_SDK_VERSION
    }
    sourceSets {
        named("main") {
            manifest.srcFile("src/androidMain/AndroidManifest.xml")
            res.srcDirs("src/androidMain/res", "src/commonMain/resources")
        }
    }
}