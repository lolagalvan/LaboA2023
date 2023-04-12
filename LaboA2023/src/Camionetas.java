public class Camionetas extends Vehiculos{

private String patente;
private int capacidad;

private int cargaActual;


    public Camionetas(String marca, String modelo, String color, int ruedas,
                      int año, String patente, int capacidad) {
        super(marca, modelo, color, ruedas, año);
        this.patente = patente;
        this.capacidad=capacidad;

    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public void MostrarCapacidad(){
        System.out.println(capacidad + "KG");
    }

    public void aniadirCarga(int aniadir){

        if(aniadir>0) {
            cargaActual = cargaActual + aniadir;
            if (cargaActual > capacidad) {
                cargaActual= capacidad;
                System.out.println("es mucha carga)");
            } else {
                System.out.println("se añadio la carga");
            }
        }
    }
}
