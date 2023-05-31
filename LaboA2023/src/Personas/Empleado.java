package Personas;

public class Empleado extends Persona {
    private String apellido;
    private int DNI;

    private String Pais;

    private int Telefono;



    public Empleado(String nombre) {
        super(nombre);
        this.apellido=apellido;
        this.DNI=DNI;
        this.Telefono=Telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    @Override
    public String toString() {
        return "Personas.Empleado" + ' ' + getNombre() + "->" +
                getClass().getCanonicalName();
    }
}
