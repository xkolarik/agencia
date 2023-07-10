package com.agencia.hotel.controller;

import com.agencia.hotel.model.ReservaDTO;
import com.agencia.hotel.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @PostMapping
    public ResponseEntity<String> criarReserva(@RequestBody ReservaDTO reservaDTO) {
        reservaService.criarReserva(reservaDTO);
        return ResponseEntity.ok("Reserva criada com sucesso!");
    }
}
