FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER ben@algorithmica.co.uk
VOLUME /tmp
EXPOSE 8090
ADD kotlin-spring-boot-starter-0.1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]