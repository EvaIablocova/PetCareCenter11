# Step 1: Use Maven to build the project
FROM maven:3.8.1-openjdk-11 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Step 2: Run on Tomcat
FROM tomcat:9.0-jdk11
COPY --from=builder /app/target/my-spring-boot-app.war /usr/local/tomcat/webapps/
EXPOSE 8080
