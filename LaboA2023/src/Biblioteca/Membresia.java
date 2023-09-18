package Biblioteca;

public enum Membresia {
    BRONCE(5),PLATA(15),ORO(50);
    private int cantidad;

    Membresia(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
