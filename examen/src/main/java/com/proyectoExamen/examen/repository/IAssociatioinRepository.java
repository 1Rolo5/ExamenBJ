package com.proyectoExamen.examen.repository;

import ch.qos.logback.core.net.server.Client;
import com.proyectoExamen.examen.entity.Association;
import com.proyectoExamen.examen.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IAssociatioinRepository extends MongoRepository<Association, String> {
    Boolean existsByCustomer(Customer customer);
}
