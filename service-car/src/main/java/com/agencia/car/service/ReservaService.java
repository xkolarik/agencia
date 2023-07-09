package com.agencia.car.service;

import com.agencia.car.model.Reserva;
import com.agencia.car.model.ReservaDTO;

public interface ReservaService {
    Reserva criarReserva(ReservaDTO reservaDTO);

    void save(Reserva reserva);
}
