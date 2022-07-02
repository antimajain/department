FROM openjdk:8
EXPOSE 8080
ADD /var/jenkins_home/workspace/department-service/target/department-0.0.1-SNAPSHOT.jar department-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","department-0.0.1-SNAPSHOT.jar"]