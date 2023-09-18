package Bebidas;

public class BebidaAlcoholica extends Bebida{
    private int cantAlcohol;

    public BebidaAlcoholica(String nombre,int cantAlcohol) {
        super(nombre, 0, cantAlcohol*20);
        this.cantAlcohol=cantAlcohol;
    }

    public int getCantAlcohol() {
        return cantAlcohol;
    }

    public void setCantAlcohol(int cantAlcohol) {
        this.cantAlcohol = cantAlcohol;
    }
}
