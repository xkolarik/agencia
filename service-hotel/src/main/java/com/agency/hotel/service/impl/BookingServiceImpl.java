package com.agency.hotel.service.impl;

import com.agency.hotel.model.Booking;
import com.agency.hotel.model.BookingDTO;
import com.agency.hotel.repository.BookingRepository;
import com.agency.hotel.service.BookingService;
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

        Booking bookingHotel = new Booking();

        bookingHotel.setIdAgencia(booking.getId());
        bookingHotel.setUsuario(booking.getUsuario());
        bookingHotel.setDestino(booking.getDestino());
        bookingHotel.setDt(booking.getDt());

        bookingRepository.save(bookingHotel);
    }
}
