FROM java:8.7.0-alpine

RUN mkdir -p /usr/app/server
WORKDIR /usr/app/server


COPY ./target/spring-boot-react-docker-demo-0.0.1-SNAPSHOT.jar /usr/app/server

WORKDIR /usr/app
EXPOSE 8080


RUN sh -c 'touch spring-boot-react-docker-demo-0.0.1-SNAPSHOT'

CMD ["java","-jar","spring-boot-react-docker-demo-0.0.1-SNAPSHOT"]