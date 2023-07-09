package com.agencia.air.service;

import com.agencia.air.model.Reserva;
import com.agencia.air.model.ReservaDTO;

public interface ReservaService {
    Reserva criarReserva(ReservaDTO reservaDTO);

    void save(Reserva reserva);
}
