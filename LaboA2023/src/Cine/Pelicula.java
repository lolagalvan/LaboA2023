package Cine;

public class Pelicula {
    private static int conatorPeli=0;
    private String titulo;
    private int duracion;
    private Genero genero;
    private int id;

    public Pelicula(String titulo, int duracion, Genero genero) {
        conatorPeli++;
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.id = conatorPeli;
    }

    public static int getConatorPeli() {
        return conatorPeli;
    }

    public static void setConatorPeli(int conatorPeli) {
        Pelicula.conatorPeli = conatorPeli;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int cantPelis(){
        return conatorPeli;
    }
}
