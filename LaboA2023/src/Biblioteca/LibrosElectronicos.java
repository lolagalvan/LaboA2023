package Biblioteca;

public class LibrosElectronicos {
    private String nombre;
    private String nombrePDF;

    private Autor1 autor;
    private static int cantDescargas=50;
    private int cantActualDescargas;
    private Genero genero;

    public LibrosElectronicos(String nombre, String nombrePDF, Autor1 autor, Genero genero) {
        this.nombre = nombre;
        this.nombrePDF = nombrePDF;
        this.autor = autor;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrePDF() {
        return nombrePDF;
    }

    public void setNombrePDF(String nombrePDF) {
        this.nombrePDF = nombrePDF;
    }

    public Autor1 getAutor() {
        return autor;
    }

    public void setAutor(Autor1 autor) {
        this.autor = autor;
    }

    public static int getCantDescargas() {
        return cantDescargas;
    }

    public static void setCantDescargas(int cantDescargas) {
        LibrosElectronicos.cantDescargas = cantDescargas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getCantActualDescargas() {
        return cantActualDescargas;
    }

    public void setCantActualDescargas(int cantActualDescargas) {
        this.cantActualDescargas = cantActualDescargas;
    }
}
