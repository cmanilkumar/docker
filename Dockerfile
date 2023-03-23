FROM eclipse-temurin:17

LABEL mentainer="manil@altimetrik.com"

WORKDIR /app

COPY target/docker-0.0.1-SNAPSHOT.jar /app/docker.jar

ENTRYPOINT [ "java", "-jar", "docker.jar" "12"]