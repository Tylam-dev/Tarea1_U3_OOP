package Models;

import Enum.Etapas_enums;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Etapa {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    public Etapas_enums etapa;
    public List<Equipo> equipos = new ArrayList<Equipo>();
    public List<Contrincantes> contrincantes = new ArrayList<Contrincantes>();
    public Etapa(Etapas_enums etapa)
    {
        this.etapa = etapa;
    }
    public List<Equipo> getEquipos() {
        return this.equipos;
    }
    public void agregarEquipos(List<Equipo> equipos){
        this.equipos = equipos;
    }

    //Metodo recursivo para crear contrincantes.
    public void establecerContrincantes(){
        //Limite de recursividad para nuestro metodo
        if(equipos.size() > 2){
            var contrincante1 = getEquipoRandom();
            var contrincante2 = getEquipoRandom();
            var contrincantes = new Contrincantes(contrincante1, contrincante2);
            this.contrincantes.add(contrincantes);
            establecerContrincantes();
        }else {
            var contrincantes = new Contrincantes(this.equipos.get(0), this.equipos.get(1));
            this.equipos.clear();
            this.contrincantes.add(contrincantes);
        }
    }
    private Equipo getEquipoRandom(){
        var limite = this.equipos.size();
        var indiceEquipoRandom = this.random.nextInt(limite);
        var equipoSeleccionado = this.equipos.get(indiceEquipoRandom);
        this.equipos.remove(indiceEquipoRandom);
        return  equipoSeleccionado;
    }
    public void MostrarContrincantes(){
        System.out.println("Los contrincantes son:");
        for(var c : this.contrincantes){
            System.out.println(c.equipo1.nombre + " vs " + c.equipo2.nombre);
        }
    }
}
