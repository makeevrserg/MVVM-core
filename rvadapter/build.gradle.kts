import com.makeevrserg.mobilex.MobileXApk.APPLICATION_ID

plugins {
    id("android-library-convention")
    id("convention.publication")
}

kotlin {
    sourceSets {
        val androidMain by getting {
            dependencies {
                // RecyclerView
                implementation("androidx.recyclerview:recyclerview:1.2.1")
            }
        }
    }
}

android {
    namespace = "$APPLICATION_ID.rvadapter"
    buildFeatures.viewBinding = true
}
