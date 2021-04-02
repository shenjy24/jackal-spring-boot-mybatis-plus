FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD jackal.jar app.jar
ADD conf /conf
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar","--spring.config.location=/conf/application.yml"]