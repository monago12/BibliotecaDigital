plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.bibliotecadigital"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.bibliotecadigital"
        minSdk = 27
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {

    implementation ("com.android.volley:volley:1.2.1")
    implementation("androidx.tracing:tracing-perfetto-handshake:1.0.0")
    val room_version = "2.6.0"

    implementation ("androidx.room:room-runtime:$room_version")
    annotationProcessor ("androidx.room:room-compiler:$room_version")

    implementation ("androidx.recyclerview:recyclerview:1.2.1")
    // For control over item selection of both touch and mouse driven selection
    implementation ("androidx.recyclerview:recyclerview-selection:1.1.0")

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}