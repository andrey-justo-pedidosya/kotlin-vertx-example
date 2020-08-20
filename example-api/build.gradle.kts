plugins {
    kotlin("jvm")
    idea
    application
}

val junitVersion = "5.5.1"
val junitLauncherVersion = "1.5.1"
val vertXVersion = "3.8.0"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("io.vertx:vertx-lang-kotlin:$vertXVersion")
    implementation("io.vertx:vertx-web:$vertXVersion")


    testImplementation("org.junit.jupiter:junit-jupiter:$junitVersion")
    testImplementation("io.vertx:vertx-junit5:$vertXVersion")
    testImplementation("io.vertx:vertx-junit5-web-client:$vertXVersion")
}

application {
    mainClassName = "com.justo.example.AppKt"
}
