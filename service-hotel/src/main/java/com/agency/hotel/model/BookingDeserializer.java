package com.agency.hotel.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

public class BookingDeserializer implements Deserializer<Booking> {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Booking deserialize(String topic, byte[] data) {
        try {
            return objectMapper.readValue(data, Booking.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}