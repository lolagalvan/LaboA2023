package EjRepaso1;

import EjRepaso1.Partidos;

import java.util.HashSet;

public class SistemaElecciones {
    private HashSet<Votante>votantes;
    private HashSet<Partidos> partidosPoliticos;

    public SistemaElecciones(HashSet<Votante> votantes, HashSet<Partidos> partidosPoliticos) {
        this.votantes = votantes;
        this.partidosPoliticos = partidosPoliticos;
    }

    public HashSet<Votante> getVotantes() {
        return votantes;
    }

    public void setVotantes(HashSet<Votante> votantes) {
        this.votantes = votantes;
    }

    public HashSet<Partidos> getPartidosPoliticos() {
        return partidosPoliticos;
    }

    public void setPartidosPoliticos(HashSet<Partidos> partidosPoliticos) {
        this.partidosPoliticos = partidosPoliticos;
    }

}
