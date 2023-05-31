package Personas;

import Tiempo.Fecha;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    private String apellido;
    private int telefono;
    private Fecha nacimiento;

    public  Persona(String nombre, int edad, String direccion,String apellido, int telefono, Fecha nacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String imprimir() {
        String nombre = "nombre" + this.nombre;

        String edad = "edad" + this.edad;
        String direccion = "direccion" + this.direccion;
        String datos= nombre + " " + edad + " " + direccion;
        return datos;
    }
}
