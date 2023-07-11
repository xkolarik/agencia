package com.agency.car.listener;

import com.agency.car.model.Booking;
import com.agency.car.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class BookingCar {
    @Autowired
    private BookingService bookingService;

    @KafkaListener(topics = "bookingskafka", groupId = "consumer-group-car")
    public void consume(Booking booking) {
       bookingService.save(booking);
    }
}
