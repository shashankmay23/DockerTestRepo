FROM openjdk:16-alpine3.13
WORKDIR /DockerTest
# COPY .mvn/ .mvn
COPY ${PWD}/target/DockerTest-0.0.1-SNAPSHOT.jar .
# COPY mvnw pom.xml ./
# RUN ./mvnw dependency:go-offline

# COPY src ./src

CMD ["java", "-jar", "DockerTest-0.0.1-SNAPSHOT.jar"]