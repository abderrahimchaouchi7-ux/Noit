plugins {
    id("com.android.application")
}

android {
    namespace = "org.noit.smoke"
    compileSdk = 35

    defaultConfig {
        applicationId = "org.noit.smoke"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }
}
