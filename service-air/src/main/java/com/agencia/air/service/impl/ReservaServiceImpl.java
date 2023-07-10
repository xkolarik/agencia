package com.agencia.air.service.impl;

import com.agencia.air.model.Reserva;
import com.agencia.air.model.ReservaDTO;
import com.agencia.air.repository.ReservaRepository;
import com.agencia.air.service.ReservaService;
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
        Reserva reservaAir = new Reserva();

        reservaAir.setIdAgencia(reserva.getId());
        reservaAir.setUsuario(reserva.getUsuario());
        reservaAir.setDestino(reserva.getDestino());
        reservaAir.setDt(reserva.getDt());

        reservaRepository.save(reservaAir);
    }
}
