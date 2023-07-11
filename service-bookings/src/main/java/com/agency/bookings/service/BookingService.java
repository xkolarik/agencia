package com.agency.bookings.service;

import com.agency.bookings.model.Booking;
import com.agency.bookings.model.BookingDTO;

public interface BookingService {
    Booking criarReserva(BookingDTO bookingDTO);
}
