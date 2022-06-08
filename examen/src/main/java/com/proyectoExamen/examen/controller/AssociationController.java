package com.proyectoExamen.examen.controller;

import com.proyectoExamen.examen.dto.EnlaceClienteR;
import com.proyectoExamen.examen.entity.Association;
import com.proyectoExamen.examen.entity.WithdrawalAFP;
import com.proyectoExamen.examen.repository.IAssociatioinRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodHandles;

@Slf4j
@RestController
@RequestMapping("/api/association")

public class AssociationController {

    @Autowired
    private IAssociatioinRepository associatioinRepository;



    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @PostMapping("/nuevoA")
    @ResponseStatus(HttpStatus.OK)
    public String crearAssociation(@RequestBody Association association) {

         Boolean existe = associatioinRepository.existsByCustomer(association.getCustomer());
            LOGGER.info("Realizo un nuevo registro");

        if (existe) {

            return  "ya tiene una AFP";

        } else {
            associatioinRepository.save(association);
            return  "cliente registrado correctamente";
        }


    }

    @PostMapping("/nuevoR")
    public String realizarRetiroAFP(@RequestBody Association association){

        //associatioinRepository.save(association);
        //return  "cliente registrado correctamente";
        double afp = association.getMontoDisponible();
        double retiro = association.getMontoRetiro();
        double descuento = afp * 0.5;
        System.out.println(afp);
        System.out.println(retiro);
        System.out.println(descuento);

        if (retiro > afp)
        {
            return "no se puede registrar la solicitud, cantidad no pernitida"+descuento;
        }else if (retiro< descuento)
        {
            return "no puede registrar la solicitud, monto minimo no permitido";
        }else if (retiro>=descuento && retiro <=afp)
        {
            associatioinRepository.save(association);
            return "solicitud registrada correctamente";
        }else {
            return "Eliminacion requeria";
        }

        //return "";

    }


}
