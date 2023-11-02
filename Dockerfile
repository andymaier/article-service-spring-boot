# Use the official maven/Java 17 image from Docker Hub
FROM maven:3.8.4-openjdk-17 as build

# Set the working directory in the image to /app
WORKDIR /app

# Copy the pom.xml file into the image
COPY pom.xml .

# Download dependencies as a separate step to take advantage of Docker layer caching
RUN mvn dependency:go-offline

# Copy the rest of the application into the image
COPY src ./src

# Build the application
RUN mvn package 

# Use the official openjdk image for a lean production stage of our multi-stage build
FROM eclipse-temurin:17 as production

# Set the working directory in the image to /app
WORKDIR /app

# Copy the jar file from the build stage into the production image
COPY --from=build /app/target/spring-boot-codegenerator-KatalogAPIVKB3.jar .

# Set the command to run your application
CMD ["java", "-jar", "./spring-boot-codegenerator-KatalogAPIVKB3.jar"]