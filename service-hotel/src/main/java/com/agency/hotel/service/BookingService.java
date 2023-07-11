package com.agency.hotel.service;

import com.agency.hotel.model.Booking;
import com.agency.hotel.model.BookingDTO;

public interface BookingService {
    Booking criarReserva(BookingDTO bookingDTO);

    void save(Booking booking);
}
