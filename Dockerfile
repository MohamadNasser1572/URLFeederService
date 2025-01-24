FROM openjdk:21-jdk-slim
ADD target/URLFeederService.jar URLFeederService.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","URLFeederService.jar"]