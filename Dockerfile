FROM openjdk:8
ADD docker-student-springboot.jar docker-student-springboot.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "docker-student-springboot.jar"]