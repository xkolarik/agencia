package com.agency.hotel.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("booking")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Booking {

    @Id
    private String id;

    private String idAgencia;
    private String usuario;
    private String dt;
    private String destino;

}
