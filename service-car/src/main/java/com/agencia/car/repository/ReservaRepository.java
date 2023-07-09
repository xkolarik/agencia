package com.agencia.car.repository;

import com.agencia.car.model.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends MongoRepository<Reserva, String> {
    // Métodos adicionais do repositório, se necessário
}
