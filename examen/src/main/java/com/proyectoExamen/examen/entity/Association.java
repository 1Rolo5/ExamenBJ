package com.proyectoExamen.examen.entity;

import ch.qos.logback.core.net.server.Client;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Document("association")
@Data
@NoArgsConstructor
public class Association {

    @Id
    private String id;
    private Customer customer;
    private Afp afp;
    private double montoDisponible;
    private Date fechaRetiro;
    private String nrmCuenta;
    private double montoRetiro=0;


}
