package Intercambio;

import Intercambio.Textos;

public class Libro extends Textos {
    private int cantPaginas;
    private int cantCapitulos;

    public Libro(int codigo, String titulo, int anioPublicacion, int cantPaginas, int cantCapitulos) {
        super(codigo, titulo, anioPublicacion);
        this.cantPaginas = cantPaginas;
        this.cantCapitulos = cantCapitulos;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public int getCantCapitulos() {
        return cantCapitulos;
    }

    public void setCantCapitulos(int cantCapitulos) {
        this.cantCapitulos = cantCapitulos;
    }

    public String toString(){
        String libro = "codigo: "+ getCodigo()+"titulo: "+getTitulo()+"anio de publicacion: "+getAnioPublicacion()+"cantidad Paginas: " + getCantPaginas();
        return libro;
    }

    @Override
    public boolean prestar() {
        boolean prestable = false;
        if(cantCapitulos %3 ==0){
            System.out.println("El Libro se dará prestado");
            prestable = true;
        }else{
            System.out.println("El Libro no se prestará");
        }
        return prestable;
    }

    @Override
    public boolean agregarElemento() {
        boolean agregado = false;
        if(prestar() == true){
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
            agregado = true;
        }else {
            System.out.println("El articulo ingresado no podrá ingresar a nuestro sistema");
        }
        return agregado;
    }
}
