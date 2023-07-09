package com.agencia.hotel.service;

import com.agencia.hotel.model.Reserva;
import com.agencia.hotel.model.ReservaDTO;

public interface ReservaService {
    Reserva criarReserva(ReservaDTO reservaDTO);

    void save(Reserva reserva);
}
