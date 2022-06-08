package com.proyectoExamen.examen.repository;

import com.proyectoExamen.examen.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICustomerRepository  extends MongoRepository<Customer,String> {
}
