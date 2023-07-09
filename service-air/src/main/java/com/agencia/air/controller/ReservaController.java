package com.agencia.air.controller;

import com.agencia.air.model.Reserva;
import com.agencia.air.model.ReservaDTO;
import com.agencia.air.model.ReservaResponse;
import com.agencia.air.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @PostMapping
    public ResponseEntity<ReservaResponse> criarReserva(@RequestBody ReservaDTO reservaDTO) {
        Reserva response = reservaService.criarReserva(reservaDTO);
        ReservaResponse reservaResponse = new ReservaResponse("Reserva criada com sucesso!", response);
        return ResponseEntity.ok(reservaResponse);
    }
}
