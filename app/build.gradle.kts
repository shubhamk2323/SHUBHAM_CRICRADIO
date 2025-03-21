plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.hilt)
    kotlin("plugin.serialization") version "1.9.0"
    kotlin("kapt")
}

android {
    namespace = "com.example.cricketradio"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.cricketradio"
        minSdk = 25
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation("io.coil-kt:coil-compose:2.5.0")
    implementation(libs.hilt.android)

    implementation(libs.ktor.client.serialization)
    implementation(libs.kotlinx.serialization.json)

//    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")

    implementation("com.google.dagger:hilt-android:2.51.1")
    kapt("com.google.dagger:hilt-android-compiler:2.51.1")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0") // FOR COMPOSE

    implementation("io.ktor:ktor-client-core:2.3.8")
    implementation("io.ktor:ktor-client-cio:2.3.8") // Or OkHttp: ktor-client-okhttp
    implementation("io.ktor:ktor-client-content-negotiation:2.3.8")
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.8")
    implementation("io.ktor:ktor-client-logging:2.3.8")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")

    // WebSockets support
    implementation("io.ktor:ktor-client-websockets:2.3.6")

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}



//    implementation(libs.hilt.android)
//    implementation(libs.firebase.appdistribution.gradle)
//    kapt(libs.hilt.compiler)
//
//    implementation(libs.ktor.client.serialization)
//    implementation(libs.kotlinx.serialization.json)
//
////    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")
//
//    implementation("com.google.dagger:hilt-android:2.50")
//    kapt("com.google.dagger:hilt-android-compiler:2.50")
//    implementation("androidx.hilt:hilt-navigation-compose:1.0.0") // FOR COMPOSE
//
//
//
//    implementation("com.squareup.retrofit2:retrofit:2.9.0")
//    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
//    implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2")
//    implementation("io.ktor:ktor-client-logging:2.3.8")
//
//
//
//    implementation("io.ktor:ktor-client-core:2.3.6")
//    implementation("io.ktor:ktor-client-cio:2.3.6") // Or OkHttp: ktor-client-okhttp
//    implementation("io.ktor:ktor-client-content-negotiation:2.3.6")
//    implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.6")
//
//    // WebSockets support
//    implementation("io.ktor:ktor-client-websockets:2.3.6")