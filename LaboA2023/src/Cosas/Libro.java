package Cosas;

import Personas.Persona;
import Tiempo.Fecha;
import lugares.Editorial;

public class Libro {
    private String titulo;
    private Persona autor;
    private int isbn;
    private int cantPaginas;
    private Editorial editorial;
    private Fecha fechaPublicacion;

    public Libro() {
    }

    public Libro(String titulo, int cantPaginas) {
        this.titulo = titulo;
        this.cantPaginas = cantPaginas;

    }

    public Libro(String titulo, Persona autor, int isbn, int cantPaginas, Editorial editorial, Fecha fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.cantPaginas = cantPaginas;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    void mostrarInfo(){
        System.out.println("Titulo: "+ titulo + " editorial: " + editorial);
        System.out.print("Autor:");
        autor.imprimir();
        System.out.println("ISBN: " + isbn);
        System.out.println("Paginas: " + cantPaginas );
        System.out.print("Fue escrito el ");
        fechaPublicacion.corta();
    }

    void libroAnterior(Libro libro1){
        this.fechaPublicacion.menorQue(libro1.getFechaPublicacion());
    }
}