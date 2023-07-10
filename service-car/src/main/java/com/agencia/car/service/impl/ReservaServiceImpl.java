package com.agencia.car.service.impl;

import com.agencia.car.model.Reserva;
import com.agencia.car.model.ReservaDTO;
import com.agencia.car.repository.ReservaRepository;
import com.agencia.car.service.ReservaService;
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
