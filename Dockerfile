FROM java:8
EXPOSE 8084
ADD /target/spring-cloud-config.jar spring-cloud-config.jar
ENTRYPOINT ["java", "-jar","spring-cloud-config.jar"]