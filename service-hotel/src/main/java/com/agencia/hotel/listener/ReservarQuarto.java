package com.agencia.hotel.listener;

import com.agencia.hotel.model.Reserva;
import com.agencia.hotel.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReservarQuarto {
    @Autowired
    private ReservaService reservaService;

    @KafkaListener(topics = "reservaskfka", groupId = "group-1")
    public void consume(Reserva reserva) {
        reservaService.save(reserva);
    }
}
