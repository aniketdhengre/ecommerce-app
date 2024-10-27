# Use the official OpenJDK image as a base
FROM openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the built JAR file into the container
COPY target/ecommerce-app.jar ecommerce-app.jar

# Run the application
CMD ["java", "-jar", "ecommerce-app.jar"]
