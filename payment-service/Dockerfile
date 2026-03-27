# -------- Build stage --------
#LABEL authors="noka"
FROM maven:3.9.9-eclipse-temurin-21 AS builder
WORKDIR /build
COPY . .
RUN mvn clean package -DskipTests
# RUN java -Djarmode=layertools -jar app.jar extract // layer caching → build nhanh hơn trong CI/CD

# -------- Run stage --------
FROM gcr.io/distroless/java21-debian12
WORKDIR /app
COPY --from=builder /build/target/*.jar app.jar
EXPOSE 9000

ENTRYPOINT ["java", "-XX:MaxRAMPercentage=75.0", "-XX:+UseG1GC", "-jar", "/app/app.jar"]