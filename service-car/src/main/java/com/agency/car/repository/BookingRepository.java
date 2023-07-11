package com.agency.car.repository;

import com.agency.car.model.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends MongoRepository<Booking, String> {
    // Métodos adicionais do repositório, se necessário
}
