public class Cafetera {
    private int cantMax;
    private int cantActual;


    public Cafetera() {
        this.cantMax = 1000;
        this.cantActual = 0;
    }

    public Cafetera(int cantMax) {
        this.cantMax = cantMax;
        this.cantActual = cantMax;
    }

    public Cafetera(int cantMax, int cantActual) {
        if (cantMax < cantActual) {
            this.cantActual = cantMax;
        } else {
            this.cantMax = cantMax;
            this.cantActual = cantMax;

        }
    }

    public void llenarcafetera() {
        this.cantActual = cantMax;

    }


    public void servirtaza(int capacidad) {
        if (capacidad > cantActual) {
            this.cantActual = cantActual - cantActual;
        } else {
            this.cantActual = cantActual - capacidad;
        }

    }

    public void vaciascafetera() {
        this.cantActual = cantActual - cantActual;

    }

    public void agregacafe(int cantidad) {
        if (cantidad + cantActual > cantMax) {
            System.out.println("no se puede");
        } else {
            this.cantActual = cantActual + cantidad;
        }
    }
}





