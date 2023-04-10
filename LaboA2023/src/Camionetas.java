public class Camionetas extends Vehiculos{

private String patente;
private int capacidad;


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

    public void MostrarCapacidad(){
        System.out.println(capacidad + "KG");
    }
}
