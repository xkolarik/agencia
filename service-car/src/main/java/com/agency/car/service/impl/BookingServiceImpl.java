package com.agency.car.service.impl;

import com.agency.car.model.Booking;
import com.agency.car.model.BookingDTO;
import com.agency.car.repository.BookingRepository;
import com.agency.car.service.BookingService;
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
        Booking bookingCar = new Booking();

        bookingCar.setIdAgencia(booking.getId());
        bookingCar.setUsuario(booking.getUsuario());
        bookingCar.setDestino(booking.getDestino());
        bookingCar.setDt(booking.getDt());

        bookingRepository.save(bookingCar);
    }
}
