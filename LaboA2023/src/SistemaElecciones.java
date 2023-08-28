import java.util.HashSet;
import java.util.Map;

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
