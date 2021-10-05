FROM registry.access.redhat.com/openjdk/openjdk-11-rhel7:1.10-1.1630314161

# Configuration
# run-env.sh /deployments/run-env.sh
# env_files /deployments/env_files

# Copy in fat jar
COPY build/libs/*.jar /deployments/