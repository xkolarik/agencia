package com.agency.hotel.controller;

import com.agency.hotel.model.Booking;
import com.agency.hotel.model.BookingDTO;
import com.agency.hotel.model.BookingResponse;
import com.agency.hotel.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public ResponseEntity<BookingResponse> createBooking(@RequestBody BookingDTO bookingDTO) {
        Booking response = bookingService.criarReserva(bookingDTO);
        BookingResponse bookingResponse = new BookingResponse("Reserva de Hotel criada com sucesso!", response);
        return ResponseEntity.ok(bookingResponse);
    }
}
