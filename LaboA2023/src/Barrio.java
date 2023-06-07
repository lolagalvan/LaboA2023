import lugares.Coordenadas;
import lugares.Lugares;

import java.util.HashSet;

public class Barrio extends Lugares {
    public Barrio(String nombre, int codigo, HashSet<Coordenadas> listaCoordenadas) {
        super(nombre, codigo, listaCoordenadas);
    }
}
