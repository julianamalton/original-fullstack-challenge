FROM openjdk:8-jdk-alpine

LABEL maintainer = "Juliana Cardoso Malton<jcmalton@gmail.com>"

# Refer to Maven build -> finalName
ARG JAR_FILE=target/original-challenge-api-0.0.1-SNAPSHOT.jar

WORKDIR /opt/app

COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]