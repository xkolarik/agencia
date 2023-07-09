package com.agencia.air.model;

public class ReservaResponse {
    private String message;
    private Reserva response;

    public ReservaResponse(String message, Reserva response) {
        this.message = message;
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public Reserva getResponse() {
        return response;
    }
}
