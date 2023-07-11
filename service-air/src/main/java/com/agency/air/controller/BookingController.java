package com.agency.air.controller;

import com.agency.air.model.Booking;
import com.agency.air.model.BookingDTO;
import com.agency.air.model.BookingResponse;
import com.agency.air.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/air")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public ResponseEntity<BookingResponse> createBooking(@RequestBody BookingDTO bookingDTO) {
        Booking response = bookingService.criarReserva(bookingDTO);
        BookingResponse bookingResponse = new BookingResponse("Reserva Air criada com sucesso!", response);
        return ResponseEntity.ok(bookingResponse);
    }
}
