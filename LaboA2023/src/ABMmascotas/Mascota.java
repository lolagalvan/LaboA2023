package ABMmascotas;

import ABMmascotas.Duenio;

public abstract class Mascota {

    private String nombre;
    private Duenio duenio;
    private TipoMascota tipo;


    public Mascota(String nombre,Duenio duenio, TipoMascota tipo) {
        this.nombre = nombre;
        this.duenio = duenio;
        this.tipo = tipo;
    }

    public Mascota() {
        nombre = "Milo";
        duenio = new Duenio("Anna");
        tipo = TipoMascota.PERRO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }


    abstract void saludar(boolean esDuenio);

    abstract void alimentar();
}
