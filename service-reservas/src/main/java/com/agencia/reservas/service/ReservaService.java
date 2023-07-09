package com.agencia.reservas.service;

import com.agencia.reservas.model.Reserva;
import com.agencia.reservas.model.ReservaDTO;

public interface ReservaService {
    Reserva criarReserva(ReservaDTO reservaDTO);
}
