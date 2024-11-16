package Classes;

import Enum.Etapas_enums;
import Models.Equipo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DefinidorDeEquipos {
    private Scanner scanner = new Scanner(System.in);
    private List<Equipo> equipos = new ArrayList<Equipo>();
    public void DefinirEquipos(Etapas_enums etapa){
        var cantEquipo = etapa.getCantEquipos();
        System.out.println("Es una etapa " + etapa.getDescripcion() +
                " por lo que tiene que \n ingresar " + etapa.getCantEquipos() + " equipos");
        for (int i = 0; i < cantEquipo; i++) {
            System.out.println("Ingrese el nombre del equipo " + (i + 1));
            var nombreEquipo = this.scanner.nextLine();
            if(nombreEquipo.length() <= 1){
                throw new RuntimeException(nombreEquipo + " no puede ser nombre de un equipo \n" +
                        "ya que debe tener pas de una letra");
            }
            var nuevoEquipo = new Equipo(nombreEquipo);
            this.equipos.add(nuevoEquipo);
        }
    }
    public List<Equipo> getEquipos(){
        return this.equipos;
    }
}
