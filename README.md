# Ecossistema baseado em micro serviços, que se comunicam entre si via eventos (Publisher/Subscriber)
    - Exemplo de caso de uso: Agência de viagem, a cada reserva feita pelo usuário, um quarto, carro e assento de avião são reservados.

# Tecnologias
- JAVA 1.8
- Spring Boot
- Spring MVC
- Kafka
- Mongo DB
- Docker
- Postmon(Webservice Rest)
- Maven
- JUnit

#Observações Gerais
- Para executar o projeto local é necessário alguns steps como:
   - para cada 'service' executar mvn clean install.
   - executar docker build -t service-[nome-da-image]-image .

# Acessar os Swagger
# //RESERVAS
# http://localhost:8080/api/swagger-ui/index.html#/

# //AIR
# http://localhost:8085/api/swagger-ui/index.html#/    

# //CAR 
# http://localhost:8082/api/swagger-ui/index.html#/

# //HOTEL
# http://localhost:8083/api/swagger-ui/index.html#/

#Mongo DB 
- mongodb://user:password@localhost:27026/agencia?authSource=admin&readPreference=primary&appname=MongoDB%20Compass&directConnection=true&ssl=false
- mongodb://user:password@localhost:27027/air?authSource=admin&readPreference=primary&appname=MongoDB%20Compass&directConnection=true&ssl=false
- mongodb://user:password@localhost:27028/car?authSource=admin&readPreference=primary&appname=MongoDB%20Compass&directConnection=true&ssl=false
- mongodb://user:password@localhost:27029/hotel?authSource=admin&readPreference=primary&appname=MongoDB%20Compass&directConnection=true&ssl=false

#Postman

http://localhost:8080/api/reservas

{
    "usuario": "kolarik-teste-ok-1",
    "dt": "2023-07-09T00:00:00",
    "destino": "Marte"
}
