package com.agencia.reservas.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("reserva")
public class Reserva {

    @Id
    private String id;
    private String usuario;
    private String dt;
    private String destino;

}
