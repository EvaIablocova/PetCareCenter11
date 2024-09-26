# Base image for Spring Boot application
FROM openjdk:17-jdk-slim

# Install necessary packages
RUN apt-get update && apt-get install -y \
    wget \
    curl \
    redis-server \
    zookeeperd \
    supervisor

# Install Kafka
RUN wget https://archive.apache.org/dist/kafka/2.7.0/kafka_2.13-2.7.0.tgz && \
    tar -xzf kafka_2.13-2.7.0.tgz && \
    mv kafka_2.13-2.7.0 /opt/kafka

# Install MinIO
RUN wget https://dl.min.io/server/minio/release/linux-amd64/minio && \
    chmod +x minio && \
    mv minio /usr/local/bin/

# Set up supervisor to manage multiple services (Spring Boot, Redis, Kafka, MinIO)
COPY supervisord.conf /etc/supervisor/conf.d/supervisord.conf


# Set the JAR file as an argument
ARG JAR_FILE=target/*.jar

# Copy the JAR file into the container
COPY ${JAR_FILE} app.jar

RUN mkdir -p /app/resources/static
COPY ./src/main/resources/static /app/resources/static

# Expose necessary ports
EXPOSE 8080 6379 9092 9000 9001

# Set up the entry point for supervisor, which will run Spring Boot, Redis, Kafka, MinIO, and Zookeeper
CMD ["/usr/bin/supervisord", "-c", "/etc/supervisor/conf.d/supervisord.conf"]
