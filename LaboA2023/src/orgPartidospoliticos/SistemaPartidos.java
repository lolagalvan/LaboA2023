package orgPartidospoliticos;
import Enums.Colores;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Map;

public class SistemaPartidos {


    private HashSet<Partido>partidoPoliticos;

    public SistemaPartidos() {
        partidoPoliticos = new HashSet<>();
    }
    public SistemaPartidos(HashSet<Partido> partidoPoliticos) {
        this.partidoPoliticos = partidoPoliticos;
    }

    public HashSet<Partido> getPartidoPoliticos() {
        return partidoPoliticos;
    }

    public void setPartidoPoliticos(HashSet<Partido> partidoPoliticos) {
        this.partidoPoliticos = partidoPoliticos;
        }


}
