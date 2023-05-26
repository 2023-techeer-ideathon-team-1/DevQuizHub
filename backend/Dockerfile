FROM gradle:7.6-jdk11-alpine as build
ENV APP_HOME = /apps

WORKDIR $APP_HOME

COPY build.gradle settings.gradle gradlew $APP_HOME

COPY gradle $APP_HOME/gradle

RUN chmod +x gradlew

RUN ./gradlew build || return 0

COPY src $APP_HOME/src

RUN ./gradlew clean build

FROM openjdk:11-jre-slim-buster

ADD https://github.com/ufoscout/docker-compose-wait/releases/download/2.9.0/wait /wait
RUN chmod +x /wait

COPY ./build/libs/backend-0.0.1-SNAPSHOT.jar app.jar
CMD /wait && java -jar /app.jar