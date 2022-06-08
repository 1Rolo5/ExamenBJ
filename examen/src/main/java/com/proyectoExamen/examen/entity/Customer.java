package com.proyectoExamen.examen.entity;

import com.proyectoExamen.examen.enumerator.tipeAFP;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.sql.init.dependency.DependsOnDatabaseInitialization;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("customers")
@Data
@NoArgsConstructor
public class Customer {

    @Id
    private String id;
    private String nombres;
    private String apellidos;
    private String dni;
    private tipeAFP afp;
    private String telefono;
    private String correo;


    public Customer(String carlos, String zambrano, String s, String prima, String s1, String s2) {
    }
}
