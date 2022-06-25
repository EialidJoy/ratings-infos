FROM openjdk:11

EXPOSE 8083
ADD target/ratings-service-docker.jar ratings-service-docker.jar
ENTRYPOINT ["java", "-jar", "/ratings-service-docker.jar"]