FROM amazoncorretto:17

WORKDIR /app

COPY target/service-hotel-0.0.1-SNAPSHOT.jar service-hotel-0.0.1-SNAPSHOT.jar

EXPOSE 8083

ENTRYPOINT ["java", "-jar", "service-hotel-0.0.1-SNAPSHOT.jar"]
