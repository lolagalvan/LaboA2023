public class Persona {
    private String nombre;
    private int edad;
    private String direccion;


    public void Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
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

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void imprimir() {
        System.out.println("el nombre de la persona es: "+ nombre+ "la edad es: "+ edad + "la direccion es : "+ direccion);;
    }
}
