#!/bin/bash

# Step 1: Build the application
echo "Building the application..."
mvn clean package

# Check if the build was successful
if [ $? -ne 0 ]; then
  echo "Build failed. Exiting."
  exit 1
fi

# Step 2: Run the application
echo "Running the application..."
# Replace <your-app> with the actual name of your JAR file
java -jar target/app.jar

# Check if the application run was successful
if [ $? -ne 0 ]; then
  echo "Application failed to run."
  exit 1
fi

echo "Application ran successfully."