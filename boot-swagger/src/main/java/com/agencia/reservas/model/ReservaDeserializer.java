package com.agencia.reservas.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

public class ReservaDeserializer implements Deserializer<Reserva> {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Reserva deserialize(String topic, byte[] data) {
        try {
            return objectMapper.readValue(data, Reserva.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}