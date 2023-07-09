package com.agencia.hotel.repository;

import com.agencia.hotel.model.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends MongoRepository<Reserva, String> {
    // Métodos adicionais do repositório, se necessário
}
