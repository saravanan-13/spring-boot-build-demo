FROM java:8

VOLUME /tmp

EXPOSE 8888

ADD target/spring-boot-react-docker-demo-0.0.1-SNAPSHOT-jar-with-dependencies.jar spring-boot-react-docker-demo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","spring-boot-react-docker-demo-0.0.1-SNAPSHOT"]
