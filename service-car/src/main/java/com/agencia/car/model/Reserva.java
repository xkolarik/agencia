package com.agencia.car.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("reserva")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Reserva {

    @Id
    private String id;
    private String usuario;
    private String dt;
    private String destino;

}
