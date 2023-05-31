package formas;

import Personas.Operario;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(int bs, int alt){
        base= bs;
        altura = alt;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public double area(int base,int altura ){
        double area= base*altura;
        return area;
    }
    public double perimetro(int base,int altura ){
        double perimetro= 2*base+2*altura;
        return perimetro;
    }

    public static class Tecnico extends Operario {
        public Tecnico(String nombre) {
            super(nombre);
        }

        @Override
        public String toString() {
            return "formas.Rectangulo.Tecnico"+ ' ' + getNombre() + "->" +
                    getClass().getCanonicalName();
        }
    }
}
