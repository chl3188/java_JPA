plugins {
    id("java")
}

group = "jpa.start"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.h2database:h2:2.2.224")
    implementation("org.hibernate:hibernate-entitymanager:4.3.10.Final")


}

tasks.test {
    useJUnitPlatform()
}