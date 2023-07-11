package com.agency.air.service.impl;

import com.agency.air.model.Booking;
import com.agency.air.model.BookingDTO;
import com.agency.air.repository.BookingRepository;
import com.agency.air.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking criarReserva(BookingDTO bookingDTO) {
        // Salva a reserva no banco de dados
        Booking booking = new Booking();

        booking.setUsuario(bookingDTO.getUsuario());
        booking.setDestino(bookingDTO.getDestino());
        booking.setDt(bookingDTO.getDt());

        return bookingRepository.save(booking);
    }

    @Override
    public void save(Booking booking) {
        Booking bookingAir = new Booking();

        bookingAir.setIdAgencia(booking.getId());
        bookingAir.setUsuario(booking.getUsuario());
        bookingAir.setDestino(booking.getDestino());
        bookingAir.setDt(booking.getDt());

        bookingRepository.save(bookingAir);
    }
}
