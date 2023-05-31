package Personas;

public class Cliente extends Persona {

    private String apellido;
    private int celular;
    public Cliente(String nombre, String apellido, int celular) {
        super(nombre);
        this.apellido = apellido;
        this.celular = celular;

    }

}
