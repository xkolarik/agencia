package com.agencia.air.listener;

import com.agencia.air.model.Reserva;
import com.agencia.air.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReserveAir {
    @Autowired
    private ReservaService reservaService;

    @KafkaListener(topics = "reservaskfka", groupId = "consumer-group-air")
    public void consume(Reserva reserva) {
       reservaService.save(reserva);
    }
}
