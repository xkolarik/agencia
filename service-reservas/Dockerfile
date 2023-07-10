FROM amazoncorretto:17

WORKDIR /app

COPY target/service-reservas-0.0.1-SNAPSHOT.jar service-reservas-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "service-reservas-0.0.1-SNAPSHOT.jar"]
