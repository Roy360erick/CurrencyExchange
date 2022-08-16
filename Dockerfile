FROM openjdk:17-alpine
MAINTAINER user01
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} CurrencyExchange-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/CurrencyExchange-0.0.1-SNAPSHOT.jar"]