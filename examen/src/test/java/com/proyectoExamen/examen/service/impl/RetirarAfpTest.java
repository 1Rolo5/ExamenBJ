package com.proyectoExamen.examen.service.impl;

import com.proyectoExamen.examen.service.IretiroAFP;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class RetirarAfpTest {


    @Mock
    IretiroAFP iretiroAFP;

    @InjectMocks
    RetirarAfp retirarAfp;

    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
        when(iretiroAFP.retirarMonto(500.98,600.4)).thenReturn(700.99);

    }

    @Test
    void realizaRetiro() {
        Assertions.assertEquals(700.99,retirarAfp.realizaRetiro(500.98,600.4));
    }
}