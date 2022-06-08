package com.proyectoExamen.examen.repository;

import com.proyectoExamen.examen.entity.Afp;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IAfp extends MongoRepository<Afp,String> {
}
