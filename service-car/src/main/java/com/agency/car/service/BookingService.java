package com.agency.car.service;

import com.agency.car.model.Booking;
import com.agency.car.model.BookingDTO;

public interface BookingService {
    Booking criarReserva(BookingDTO bookingDTO);

    void save(Booking booking);
}
