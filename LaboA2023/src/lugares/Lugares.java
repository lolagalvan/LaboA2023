package lugares;

import java.util.HashSet;

public class Lugares {
    private String nombre;
    private int codigo;
    private HashSet<Coordenadas>listaCoordenadas;

    public Lugares(String nombre, int codigo, HashSet<Coordenadas> listaCoordenadas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaCoordenadas = listaCoordenadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public HashSet<Coordenadas> getListaCoordenadas() {
        return listaCoordenadas;
    }

    public void setListaCoordenadas(HashSet<Coordenadas> listaCoordenadas) {
        this.listaCoordenadas = listaCoordenadas;
    }
}
