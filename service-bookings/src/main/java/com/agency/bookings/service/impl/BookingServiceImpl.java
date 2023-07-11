package com.agency.bookings.service.impl;

import com.agency.bookings.model.Booking;
import com.agency.bookings.model.BookingDTO;
import com.agency.bookings.repository.BookingRepository;
import com.agency.bookings.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;
    private static final String TOPIC = "bookingskafka";

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public BookingServiceImpl(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public Booking criarReserva(BookingDTO bookingDTO) {
        // Salva a reserva no banco de dados
        Booking booking = new Booking();

        booking.setUsuario(bookingDTO.getUsuario());
        booking.setDt(bookingDTO.getDt());
        booking.setDestino(bookingDTO.getDestino());

        Booking booking1 = bookingRepository.save(booking);
        booking1.toString();

        // Emite o evento usando o Apache Kafka
        kafkaTemplate.send(TOPIC, booking);

        return booking;
    }
}
