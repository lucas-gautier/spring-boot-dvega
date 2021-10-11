FROM registry.access.redhat.com/openjdk/openjdk-11-rhel7:latest

# Copy in fat jar
COPY build/libs/*.jar /deployments/