package com.proyectoExamen.examen.dto;

import com.proyectoExamen.examen.entity.Association;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class EnlaceClienteR {
    //respuesta
    @NonNull
    private String message;
    private Association association;
}
