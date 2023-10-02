package orgPartidospoliticos;

import Enums.Colores;

public abstract class Ave {

    private String nombre;
    private String especie;
    private Colores color;

    public Ave(String nombre, String especie, Colores color) {
            this.nombre = nombre;
            this.especie = especie;
            this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }
}

