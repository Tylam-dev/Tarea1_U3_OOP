package Classes;

import Models.Etapa;
import Enum.Etapas_enums;

import java.util.Scanner;

public class DefinidorDeEtapa {
    private Scanner scanner = new Scanner(System.in);

    //Metodo para mostrar las etapas segun las definimos en el enum
    public Etapa CrearEtapa(){
        System.out.println("Escoja una etapa segun su indice");
        System.out.println(Etapas_enums.OCTAVOS_DE_FINAL.getId() + "." + Etapas_enums.OCTAVOS_DE_FINAL.getDescripcion() + "\n" +
                Etapas_enums.CUARTOS_DE_FINAL.getId()+"."+Etapas_enums.CUARTOS_DE_FINAL.getDescripcion()+"\n" +
                Etapas_enums.SEMIFINAL.getId()+"."+Etapas_enums.SEMIFINAL.getDescripcion()+"\n"+
                Etapas_enums.FINAL.getId()+"."+Etapas_enums.FINAL.getDescripcion());
        var inputIndiceEtapa = this.scanner.nextInt();
        var etapaSeleccionada = Etapas_enums.fromId(inputIndiceEtapa);
        return  new Etapa(etapaSeleccionada);
    }
}
