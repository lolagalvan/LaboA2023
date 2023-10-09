package restauranteInterfaz;

public class Plato {
    private String nombre;
    private String descripcion;
    private double precio;
    private TipoPlato tipo;

    private Chef cocineroPlato;

    public Plato(String nombre, String descripcion, double precio, TipoPlato tipo,Chef cocineroPlato) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipo = tipo;
        this.cocineroPlato=cocineroPlato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoPlato getTipo() {
        return tipo;
    }

    public void setTipo(TipoPlato tipo) {
        this.tipo = tipo;
    }

    public Chef getCocineroPlato() {
        return cocineroPlato;
    }

    public void setCocineroPlato(Chef cocineroPlato) {
        this.cocineroPlato = cocineroPlato;
    }
}
