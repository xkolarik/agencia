package com.agency.hotel.listener;

import com.agency.hotel.model.Booking;
import com.agency.hotel.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class BookingRoom {
    @Autowired
    private BookingService bookingService;

    @KafkaListener(topics = "bookingskafka", groupId = "consumer-group-hotel")
    public void consume(Booking booking) {
        bookingService.save(booking);
    }
}
