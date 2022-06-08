package com.proyectoExamen.examen.service;

import com.proyectoExamen.examen.dto.EnlaceClienteR;
import com.proyectoExamen.examen.dto.REafp;
import com.proyectoExamen.examen.entity.Afp;
import com.proyectoExamen.examen.entity.Association;
import com.proyectoExamen.examen.entity.WithdrawalAFP;

import java.util.List;

public interface IAfpService {
    EnlaceClienteR enlacecliente(Association association);

    REafp removerAFP(WithdrawalAFP withdrawalAFP);
    Afp createAfp(Afp afp);
    List<Afp> findAllAfp();
    Afp findByIdAfp(Long id);
    Afp updateAfp(Afp afp);

    void deleteAfp (Long id);
}
