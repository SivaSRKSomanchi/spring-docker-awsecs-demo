FROM openjdk:8
EXPOSE 8080
ADD target/spring-docker-awsecs-demo.jar spring-docker-awsecs-demo.jar
CMD ["java", "-jar", "/spring-docker-awsecs-demo.jar"] 