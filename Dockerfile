# the first stage of our build will use a maven 3.6.3 parent image
FROM maven:3.6.3-openjdk-11-slim as BUILDER

# specify the version of the jar file to generate
ARG VERSION=0.0.1-SNAPSHOT

# specify the current working directory
WORKDIR /build/

# copy the pom and src code to the container
COPY pom.xml /build/
COPY src /build/src/

# package our application code
RUN mvn clean package

# copy the generated jar file to the container
COPY target/mybooting-web-${VERSION}.jar target/application.jar

# the second/final stage of our build will use open jdk 11.0.8
FROM openjdk:11.0.8-jre-slim

# specify the current working directory
WORKDIR /app/

# copy only the artifacts we need from the first stage and discard the rest
COPY --from=BUILDER /build/target/application.jar /app/

# set the start up command to execute the jar
CMD java -jar /app/application.jar