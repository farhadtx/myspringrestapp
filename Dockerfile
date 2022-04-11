FROM openjdk:11
ADD target/myspringrestapp.jar myspringrestapp.jar
ENTRYPOINT ["java", "-jar", "myspringrestapp.jar"]
EXPOSE 8080
