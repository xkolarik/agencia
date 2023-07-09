package com.agencia.hotel.service.impl;

import com.agencia.hotel.model.Reserva;
import com.agencia.hotel.model.ReservaDTO;
import com.agencia.hotel.repository.ReservaRepository;
import com.agencia.hotel.service.ReservaService;
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
//        // Salva a reserva no banco de dados
//        Reserva reserva = new Reserva();
//
//        reservaRepository.save(reserva);
//
//        // Emite o evento usando o Apache Kafka
//        kafkaTemplate.send(TOPIC, reserva);

        return null;
    }

    @Override
    public void save(Reserva reserva) {
        reservaRepository.save(reserva);
    }
}