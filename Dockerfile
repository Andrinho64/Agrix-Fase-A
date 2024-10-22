# Estágio de build (build-image)
FROM maven:3.8.4-openjdk-17 AS build-image
WORKDIR /to-build-app  # Ajuste do WORKDIR conforme esperado pelo teste
COPY . .
RUN mvn install
RUN mvn package

# Estágio final
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build-image /to-build-app/target/agrix-0.0.1-SNAPSHOT.jar /app/agrix.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/agrix.jar"]
