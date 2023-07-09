package com.agencia.reservas.service.impl;

import com.agencia.reservas.model.Reserva;
import com.agencia.reservas.model.ReservaDTO;
import com.agencia.reservas.repository.ReservaRepository;
import com.agencia.reservas.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;
    private static final String TOPIC = "reservaskfka";

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public ReservaServiceImpl(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public Reserva criarReserva(ReservaDTO reservaDTO) {
        // Salva a reserva no banco de dados
        Reserva reserva = new Reserva();

        reserva.setUsuario(reservaDTO.getUsuario());
        reserva.setDt(reservaDTO.getDt());
        reserva.setDestino(reservaDTO.getDestino());

        Reserva reserva1 = reservaRepository.save(reserva);
        reserva1.toString();

        // Emite o evento usando o Apache Kafka
        kafkaTemplate.send(TOPIC, reserva);

        return reserva;
    }
}
