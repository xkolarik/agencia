package com.agency.bookings.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("booking")
public class Booking {

    @Id
    private String id;
    private String usuario;
    private String dt;
    private String destino;

}
