FROM gradle:jdk17 AS builder

WORKDIR /app

COPY build.gradle settings.gradle ./
RUN gradle build --no-daemon || return 0
COPY . .
RUN gradle bootJar --no-daemon

FROM gcr.io/distroless/java17-debian11

WORKDIR /app
COPY --from=builder /app/build/libs/*.jar /app/app.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
