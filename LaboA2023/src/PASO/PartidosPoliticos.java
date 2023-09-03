package PASO;

import PASO.Candidato;

public enum PartidosPoliticos {
    ELPOLIAVANZA("El Poli Avanza", new Candidato()), JUNTOSPORELPOLI("Juntos Por El Poli", new Candidato()), UNIONPORLADOCENCIA("Union Por La Docencia",new Candidato()), FRENTEDECONSTITUYENTES("Frente De Constituyentes", new Candidato());

    private String nombre;
    private Candidato candidato;

    PartidosPoliticos(String nombre, Candidato candidato) {
        this.nombre = nombre;
        this.candidato = candidato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
}
