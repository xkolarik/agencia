package com.agencia.car.listener;

import com.agencia.car.model.Reserva;
import com.agencia.car.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReservarCar {
    @Autowired
    private ReservaService reservaService;

    @KafkaListener(topics = "reservaskfka", groupId = "consumer-group-car")
    public void consume(Reserva reserva) {
       reservaService.save(reserva);
    }
}
