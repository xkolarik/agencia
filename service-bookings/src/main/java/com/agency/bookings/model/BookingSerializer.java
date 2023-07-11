package com.agency.bookings.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serializer;

public class BookingSerializer implements Serializer<Booking> {
        private final ObjectMapper objectMapper = new ObjectMapper();

        @Override
        public byte[] serialize(String topic, Booking data) {
            try {
                return objectMapper.writeValueAsBytes(data);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
}
