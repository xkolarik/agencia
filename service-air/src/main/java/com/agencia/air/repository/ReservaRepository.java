package com.agencia.air.repository;

import com.agencia.air.model.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends MongoRepository<Reserva, String> {
    // Métodos adicionais do repositório, se necessário
}
