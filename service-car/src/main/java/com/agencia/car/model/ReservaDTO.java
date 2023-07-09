package com.agencia.car.model;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class ReservaDTO {
    private String usuario;
    private String dt;
    private String destino;

}
