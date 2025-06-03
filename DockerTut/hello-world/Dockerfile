# Use node.js official image as the base image.

FROM node:latest

# Set the working directory in the container to /app
WORKDIR /user/src/app

# Copy package.json and package-lock.json to the working directory
COPY package*.json ./

# Install the dependencies
RUN npm install

# Copy the rest of the application code to the working directory
COPY . .

# Expose the port the app runs on
EXPOSE 3000

# Start the application
CMD ["node", "index.js"]

# Note: Make sure to replace "index.js" with the entry point of your application if it's different.
# This Dockerfile sets up a Node.js application in a Docker container.