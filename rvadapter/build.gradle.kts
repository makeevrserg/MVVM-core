import com.makeevrserg.mobilex.MobileXApk.APPLICATION_ID

plugins {
    id("kmm-library-convention")
}

kotlin {
    sourceSets {
        val androidMain by getting {
            dependencies {
                implementation(libs.androidx.core.ktx)
                implementation("androidx.recyclerview:recyclerview:1.2.1")
            }
        }
    }
}

android {
    namespace = "$APPLICATION_ID.rvadapter"
    buildFeatures.viewBinding = true
}
