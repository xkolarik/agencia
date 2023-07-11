package com.agency.hotel.repository;

import com.agency.hotel.model.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends MongoRepository<Booking, String> {
    // Métodos adicionais do repositório, se necessário
}
