package com.proyectoExamen.examen.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    @DisplayName("probando data del cliente")

    void testCustomer(){
        Customer customer = new Customer("Rolando","Balarezo","75509576","INTEGRA","928306906","rjsb1597@gmail.com");

        String correoEsperado = "Rolando";
        String correoOficial = customer.getNombres();

        Assertions.assertEquals(correoEsperado,correoOficial);
    }

}