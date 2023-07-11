package com.agency.air.model;

public class BookingResponse {
    private String message;
    private Booking response;

    public BookingResponse(String message, Booking response) {
        this.message = message;
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public Booking getResponse() {
        return response;
    }
}
