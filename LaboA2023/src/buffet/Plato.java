package buffet;

public class Plato {
    private String nombre;
    private int precio;
    private int cantCalorias;


    public Plato(String nombre, int precio, int cantCalorias) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantCalorias= cantCalorias;
    }

    public Plato(String nombre, int precio) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }
}
