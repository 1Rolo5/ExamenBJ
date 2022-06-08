package com.proyectoExamen.examen.service.impl;

import com.proyectoExamen.examen.service.IretiroAFP;

public class RetirarAfp {
    IretiroAFP iretiroAFP;
    public double realizaRetiro(double monto1, double montoD){
        return iretiroAFP.retirarMonto(monto1,montoD);
    }
}
