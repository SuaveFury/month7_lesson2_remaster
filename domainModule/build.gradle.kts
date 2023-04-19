plugins {
    id(Java.javaLibrary)
    id(Plugins.Kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}
dependencies{
    //Coroutines
    implementation(Coroutines.coroutinesCore)
    //Javax
    implementation(Javax.javax)
}