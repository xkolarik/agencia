package com.agencia.reservas.repository;

import com.agencia.reservas.model.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends MongoRepository<Reserva, String> {
    // Métodos adicionais do repositório, se necessário
}
