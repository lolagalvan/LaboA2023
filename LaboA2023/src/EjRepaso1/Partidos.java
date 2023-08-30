package EjRepaso1;

import EjRepaso1.Candidato;

public enum Partidos {
 ELPOLIAVANZA("El Poli Avanza",new Candidato()),JUNTOSPORELPOLI("Juntos Por El Poli",new Candidato()),UNIONPORLADOCENCIA("Union Por La Docencia", new Candidato()),ELFRENTEDECONSTITUYENTES("El Frente De Constituyentes",new Candidato())
    ;

    private String nombre;
    private Candidato representante;

    Partidos(String nombre, Candidato representante) {
        this.nombre = nombre;
        this.representante = representante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Candidato getRepresentante() {
        return representante;
    }

    public void setRepresentante(Candidato representante) {
        this.representante = representante;
    }
}
