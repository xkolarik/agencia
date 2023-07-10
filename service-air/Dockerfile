FROM amazoncorretto:17

WORKDIR /app

COPY target/service-air-0.0.1-SNAPSHOT.jar service-air-0.0.1-SNAPSHOT.jar

EXPOSE 8086

ENTRYPOINT ["java", "-jar", "service-air-0.0.1-SNAPSHOT.jar"]
