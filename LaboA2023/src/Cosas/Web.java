package Cosas;

import Personas.Cliente;
import componentes.Componentes;
import pago.Compra;
import pago.MetodoPago;

import java.util.ArrayList;

public class Web {
    private ArrayList<Compra>computadorasVendidas;
    private ArrayList<Componentes> componentes;

    public Web(ArrayList<Componentes>componentes,ArrayList<Compra>computadorasVendidas) {
        this.componentes= componentes;
        this.computadorasVendidas= computadorasVendidas;
    }

    public ArrayList<Compra> getComputadorasVendidas() {
        return computadorasVendidas;
    }

    public void setComputadorasVendidas(ArrayList<Compra> computadorasVendidas) {
        this.computadorasVendidas = computadorasVendidas;
    }

    public ArrayList<Componentes> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componentes> componentes) {
        this.componentes = componentes;
    }

    public void agregarComponente (){componentes.add(new Componentes());};
    public void sacarComponentes(){componentes.remove(0);};

    public void hacerCompra(ArrayList<Componentes> componentes, Cliente cliente, MetodoPago metodopago, int preciofinal){
        Compra compra = new Compra(cliente, metodopago, componentes, preciofinal);
        for (Componentes componente:componentes) {
            componente.setStock(componente.getStock()-1);
        }
        computadorasVendidas.add(compra);
    }


}
