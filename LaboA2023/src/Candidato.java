import Personas.Persona;
import Tiempo.Fecha;
import sistemaLugares.Provincia;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Candidato extends Persona {
    private Partidos partido;
    private HashMap<ProvinciaEleccion, Integer> cantVotos;
    private HashSet<String>listaPropuestas;
    public Candidato(String nombre, int edad, String direccion, String apellido, int telefono, Fecha nacimiento, Partidos partido,HashMap<ProvinciaEleccion, Integer> cantVotos,HashSet<String>listaPropuestas ) {
        super(nombre, edad, direccion, apellido, telefono, nacimiento);
        this.partido= partido;
        this.cantVotos=cantVotos;
        this.listaPropuestas=listaPropuestas;
    }
    public Candidato(){
       super();

    }

    public Partidos getPartido() {
        return partido;
    }

    public void setPartido(Partidos partido) {
        this.partido = partido;
    }

    public HashMap<ProvinciaEleccion, Integer> getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(HashMap<ProvinciaEleccion, Integer> cantVotos) {
        this.cantVotos = cantVotos;
    }

    public HashSet<String> getListaPropuestas() {
        return listaPropuestas;
    }

    public void setListaPropuestas(HashSet<String> listaPropuestas) {
        this.listaPropuestas = listaPropuestas;
    }
    public int votosporProvincia () {
        int contador = 0;
        int cantVotantes = 0;
        for (Map.Entry<ProvinciaEleccion, Integer> entrada : partido.getRepresentante().getCantVotos().entrySet()) {
            contador = entrada.getValue() + contador;
            System.out.println(entrada.getKey() + " " + contador);
        }

        return contador;
    }   
}
