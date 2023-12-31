plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.intercambiophoto.aplicacionandroi"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.intercambiophoto.aplicacionandroi"
        minSdk = 24
        targetSdk = 33
        versionCode = 3
        versionName = "3.0"

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
    //Firestore
    implementation("com.google.firebase:firebase-storage:20.3.0")
    implementation("com.squareup.picasso:picasso:2.8")
    //otros
    implementation ("org.osmdroid:osmdroid-android:6.1.8")
    implementation ("org.osmdroid:osmdroid-wms:6.1.11")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.recyclerview:recyclerview:1.1.0")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("com.google.firebase:firebase-auth-ktx:22.1.2")
    implementation("com.google.firebase:firebase-auth:22.1.2")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    //MQTT
    implementation("org.eclipse.paho:org.eclipse.paho.client.mqttv3:1.2.5")
    implementation("com.android.support:support-v4:28.0.0")
    implementation("com.android.support:localbroadcastmanager:28.0.0")
    implementation("org.eclipse.paho:org.eclipse.paho.android.service:1.1.1"){
        exclude ("group:com.android.suppor")
        exclude("module:appcompat-v7")
        exclude("module:suppor-v4")
    }
}