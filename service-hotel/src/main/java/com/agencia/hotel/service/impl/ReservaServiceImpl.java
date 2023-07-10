package com.agencia.hotel.service.impl;

import com.agencia.hotel.model.Reserva;
import com.agencia.hotel.model.ReservaDTO;
import com.agencia.hotel.repository.ReservaRepository;
import com.agencia.hotel.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public Reserva criarReserva(ReservaDTO reservaDTO) {
        // Salva a reserva no banco de dados
        Reserva reserva = new Reserva();

        reserva.setUsuario(reservaDTO.getUsuario());
        reserva.setDestino(reservaDTO.getDestino());
        reserva.setDt(reservaDTO.getDt());

        return reservaRepository.save(reserva);
    }

    @Override
    public void save(Reserva reserva) {
        reservaRepository.save(reserva);
    }
}
