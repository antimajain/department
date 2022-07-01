FROM openjdk:8
EXPOSE 8081
ADD target/department-0.0.1-SNAPSHOT.jar department-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","department-0.0.1-SNAPSHOT.jar"]