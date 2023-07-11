package com.agency.air.service;

import com.agency.air.model.Booking;
import com.agency.air.model.BookingDTO;

public interface BookingService {
    Booking criarReserva(BookingDTO bookingDTO);

    void save(Booking booking);
}
