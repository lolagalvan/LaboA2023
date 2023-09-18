package Bebidas;

public class Bebida {
    private String nombre;
    private int coefincientePositividad;
    private int coeficienteNegativo;

    public Bebida(String nombre, int coefincientePositividad, int coeficienteNegativo) {
        this.nombre = nombre;
        this.coefincientePositividad = coefincientePositividad;
        this.coeficienteNegativo = coeficienteNegativo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCoefincientePositividad() {
        return coefincientePositividad;
    }

    public void setCoefincientePositividad(int coefincientePositividad) {
        this.coefincientePositividad = coefincientePositividad;
    }

    public int getCoeficienteNegativo() {
        return coeficienteNegativo;
    }

    public void setCoeficienteNegativo(int coeficienteNegativo) {
        this.coeficienteNegativo = coeficienteNegativo;
    }
}
