package ABMmascotas;

import ABMmascotas.Duenio;

public abstract class Mascota {
    private String nombreMascota;
    private Duenio duenio;
    private TipoMascota tipo;

    public Mascota(String nombreMascota, Duenio duenio) {
        this.nombreMascota = nombreMascota;
        this.duenio = duenio;
    }

    public Mascota() {
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }
    public abstract void saludar(boolean esDuenio);
    public abstract void alimentar();
    public abstract TipoMascota devolverTipo();
}
