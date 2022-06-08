package com.proyectoExamen.examen.dto;

import com.proyectoExamen.examen.entity.WithdrawalAFP;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class REafp {

    @NonNull
    private String message;

    private WithdrawalAFP withdrawalAFP;
}
