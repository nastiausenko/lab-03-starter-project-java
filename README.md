# Simple web app (Java)

This is a starter project for the third laboratory assignment on containerization.
This project is written in [Java](https://www.oracle.com/java/) programming
language and uses the [Spring Boot](https://spring.io/projects/spring-boot) framework.

## How to run

As the project is written in Java, you will need JDK installed.
Recommended version of JDK is 17 and above.

### Running with Gradle

Firstly, build the project using command:
```
./gradlew bootJar
```
As the project is built, you can start the project using the following
command:
```
java -jar build/libs/lab3-java-0.0.1-SNAPSHOT.jar
```
Open http://127.0.0.1:8080 in your browser to see the main project page.