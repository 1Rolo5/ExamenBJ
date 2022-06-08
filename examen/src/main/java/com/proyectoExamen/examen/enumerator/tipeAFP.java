package com.proyectoExamen.examen.enumerator;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum tipeAFP {

    PRIMA("PRIMA"),INTEGRA("INTEGRA"), PROFUTURO("PROFUTURO"), HABITAD("HABITAD");
    private String name;
}
