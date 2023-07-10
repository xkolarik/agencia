FROM amazoncorretto:17

WORKDIR /app

COPY target/service-car-0.0.1-SNAPSHOT.jar service-car-0.0.1-SNAPSHOT.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "service-car-0.0.1-SNAPSHOT.jar"]
