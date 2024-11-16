package org.example;

import Classes.DefinidorDeEquipos;
import Classes.DefinidorDeEtapa;
import Models.Etapa;

public class Main {
    public static void main(String[] args) {
        DefinidorDeEquipos definidorDeEquipos = new DefinidorDeEquipos();
        DefinidorDeEtapa definidorDeEtapa = new DefinidorDeEtapa();
        Etapa etapa;
        etapa = definidorDeEtapa.CrearEtapa();
        definidorDeEquipos.DefinirEquipos(etapa.etapa);
        etapa.equipos = definidorDeEquipos.getEquipos();
        etapa.establecerContrincantes();
        etapa.MostrarContrincantes();
    }
}