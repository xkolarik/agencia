FROM amazoncorretto:17

WORKDIR /app

COPY target/service-bookings-0.0.1-SNAPSHOT.jar service-bookings-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "service-bookings-0.0.1-SNAPSHOT.jar"]
