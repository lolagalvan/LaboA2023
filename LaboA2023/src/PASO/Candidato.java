package PASO;

import Personas.Persona;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Candidato extends Persona {
    private PartidosPoliticos partido;
    private HashMap<String, HashSet<String>>propuestas;
    private HashMap<Provincia,Integer> votosProvincia;


    public Candidato(String nombre, int edad, String direccion, String apellido, int telefono, String pais, PartidosPoliticos partido, HashMap<String, HashSet<String>>propuestas, HashMap<Provincia,Integer> votosProvincia ) {
        super();
        this.partido = partido;
        this.propuestas = propuestas;
        this.votosProvincia = votosProvincia;
    }

    public Candidato(PartidosPoliticos partido) {
        this.partido = partido;
        propuestas = new HashMap<>();
        votosProvincia = new HashMap<>();
    }

    public Candidato() {

    }

    public PartidosPoliticos getPartido() {
        return partido;
    }

    public void setPartido(PartidosPoliticos partido) {
        this.partido = partido;
    }

    public HashMap<String, HashSet<String>> getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(HashMap<String, HashSet<String>> propuestas) {
        this.propuestas = propuestas;
    }

    public HashMap<Provincia, Integer> getVotosProvincia() {
        return votosProvincia;
    }

    public void setVotosProvincia(HashMap<Provincia, Integer> votosProvincia) {
        this.votosProvincia = votosProvincia;
    }

   public int votosTotales(){
        int votos = 0;
        for (Map.Entry<Provincia,Integer>entry: votosProvincia.entrySet()){
            votos += entry.getValue();

        }
        return votos;
    }


}
