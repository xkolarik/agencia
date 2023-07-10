package com.agencia.car.controller;

import com.agencia.car.model.Reserva;
import com.agencia.car.model.ReservaDTO;
import com.agencia.car.model.ReservaResponse;
import com.agencia.car.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @PostMapping
    public ResponseEntity<ReservaResponse> criarReserva(@RequestBody ReservaDTO reservaDTO) {
        Reserva response = reservaService.criarReserva(reservaDTO);
        ReservaResponse reservaResponse = new ReservaResponse("Reserva de Car criada com sucesso!", response);
        return ResponseEntity.ok(reservaResponse);
    }
}
