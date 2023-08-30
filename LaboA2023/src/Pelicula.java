public class Pelicula {
    private String titulo;
    private int duracion;
    private Genero genero;
    private int identificador;

    public Pelicula(String titulo, int duracion, Genero genero, int identificador) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.identificador = identificador;
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

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
}
