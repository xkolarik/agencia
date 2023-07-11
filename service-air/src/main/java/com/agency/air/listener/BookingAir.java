package com.agency.air.listener;

import com.agency.air.model.Booking;
import com.agency.air.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class BookingAir {
    @Autowired
    private BookingService bookingService;

    @KafkaListener(topics = "bookingskafka", groupId = "consumer-group-air")
    public void consume(Booking booking) {
       bookingService.save(booking);
    }
}
