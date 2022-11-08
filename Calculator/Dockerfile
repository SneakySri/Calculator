FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} arithmetic.jar
ENTRYPOINT ["java","-jar","/arithmetic.jar"]