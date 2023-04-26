import java.util.ArrayList;

public class Compra {
    private ArrayList<Componentes>componentes;
private Cliente cliente;
private MetodoPago pago;

private int precioFinal;



    public Compra(Cliente cliente, MetodoPago pago, ArrayList<Componentes> componentes,int precioFinal) {
        if(verificarComponentes(componentes)&& verificarStock(componentes)) {
            this.cliente = cliente;
            this.pago = pago;
            this.componentes = componentes;
            this.precioFinal = precioFinal;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public MetodoPago getPago() {
        return pago;
    }

    public void setPago(MetodoPago pago) {
        this.pago = pago;
    }

    public ArrayList<Componentes> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componentes> componentes) {
        this.componentes = componentes;
    }
    public boolean verificarComponentes(ArrayList<Componentes>componentes ){
        boolean CPU = false;
        boolean Entrada = false;
        boolean Salida = false;
        boolean compra = false;
        for (Componentes componente: componentes) {
            if (componente instanceof CPU){
                CPU = true;
            }
            if (componente instanceof Entrada){
                Entrada = true;
            }
            if (componente instanceof Salida){

            }
            if (CPU== true && Entrada == true && Salida == true){
                compra = true;
            }
        }
        return  compra;

    }
    public boolean verificarStock(ArrayList<Componentes>componentes){
        boolean stock = false;
        boolean compra = false;
        for (Componentes componente: componentes) {
            if (componente.getStock()>0){
                stock = true;
            }
            if (stock = true){
                compra = true;
            }
        }
        return compra;

    }

    public double calcularPrecio (MetodoPago metodopago , ArrayList<Componentes>componentes ){
        int Pfinal = 0;
        for (Componentes componente:componentes) {
            Pfinal = precioFinal + componente.getPrecio();
            if (metodopago instanceof Tarjeta){
                Pfinal = Pfinal*100/5;
            }
        }
        return Pfinal;
    }
    public void cantEntrada(){
        int cantEntrada= 0;
        for (Componentes componente: componentes) {
            if (componente instanceof Entrada){
                    cantEntrada++;
            }
            System.out.println("los componentes de entrada son "+ cantEntrada) ;
        }
    }
    public void cantSalida(){
        int cantSalida= 0;
        for (Componentes componente: componentes) {
            if (componente instanceof Salida){
                cantSalida++;
            }
            System.out.println("los componentes de salida son "+ cantSalida) ;
        }
    }




}
