FROM openjdk:8
EXPOSE 8081
ADD target/department.jar departmen.jar
ENTRYPOINT ["java", "-jar","department.jar"]