package Intercambio;
import java.time.LocalDate;

public class Revista extends Textos {
    private LocalDate fechaPublicacion;

    public Revista(int codigo, String titulo, int anioPublicacion, LocalDate fechaPublicacion) {
        super(codigo, titulo, anioPublicacion);
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String toString(){
        String revista = "codigo: "+ getCodigo()+"titulo: "+getTitulo()+"anio de publicacion: "+getAnioPublicacion()+"fecha: " + getFechaPublicacion();
        return revista;
    }

    @Override
    public boolean prestar() {
        boolean prestable = false;
        if (fechaPublicacion.isBefore(LocalDate.now().minusMonths(3))) {
            System.out.println("La revista se dara prestada");
            prestable = true;
        }else {
            System.out.println("La revista no se prestara");

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
