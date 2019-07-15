/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java project to get you started.
 * For more details take a look at the Java Quickstart chapter in the Gradle
 * User Manual available at https://docs.gradle.org/5.4.1-20190522110022+0000/userguide/tutorial_java_projects.html
 */

plugins {
    // Apply the java plugin to add support for Java
    java

    // Apply the application plugin to add support for building an application
    application

    id("com.github.johnrengelman.shadow").version("5.0.0")
}

repositories {
    // Use jcenter for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // This dependency is found on compile classpath of this component and consumers.
    implementation("com.google.guava:guava:27.0.1-jre")
    implementation("org.apache.commons:commons-lang3:3.9")

    // Wikidata Toolkit
    implementation("org.wikidata.wdtk:wdtk-datamodel:0.9.0")
    implementation("org.wikidata.wdtk:wdtk-dumpfiles:0.9.0")
    implementation("org.wikidata.wdtk:wdtk-rdf:0.9.0")
    implementation("info.picocli:picocli:4.0.0-alpha-3")

    // For ZSTD dumps
    implementation("com.github.luben:zstd-jni:1.4.0-1")

    // RDF
    implementation("org.eclipse.rdf4j:rdf4j-repository-sparql:2.3.2")
    runtime("org.eclipse.rdf4j:rdf4j-rio-ntriples:2.3.2")

    // logging implementation
    runtimeOnly("org.slf4j:slf4j-simple:1.7.26")

    // json
    implementation("com.fasterxml.jackson:jackson-bom:2.9.9")
    implementation("com.kjetland:mbknor-jackson-jsonschema_2.13.0-M5:1.0.34")
    implementation("com.fasterxml.jackson.module:jackson-module-parameter-names:2.9.9")

    // jdbi
    implementation("org.jdbi:jdbi3-core:3.8.2");

    // mysql
    implementation("mysql:mysql-connector-java:8.0.16")

    // HTTP rest client
    implementation("com.konghq:unirest-java:2.3.08")
    implementation("com.konghq:unirest-objectmapper-jackson:2.3.08")

    // Use JUnit test framework
    testImplementation("junit:junit:4.12")
}

application {
    // Define the main class for the application
    mainClassName = "io.github.bennofs.wdumper.App"
}
