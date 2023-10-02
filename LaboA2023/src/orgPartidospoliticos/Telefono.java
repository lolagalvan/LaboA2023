package orgPartidospoliticos;


public class Telefono extends Dispositivos implements Mensaje{
    private Compañia compania;
    private int numeroCelular;
    private boolean prendido;
    private boolean creditoDisponible;


    public Telefono(int numeroSerie, String fabricante, String modelo, Compañia compania, int numeroCelular, boolean prendido, boolean creditoDisponible) {
        super(numeroSerie, fabricante, modelo);
        this.compania = compania;
        this.numeroCelular = numeroCelular;
        this.prendido = prendido;
        this.creditoDisponible = creditoDisponible;
    }

    public Compañia getCompania() {
        return compania;
    }

    public void setCompania(Compañia compania) {
        this.compania = compania;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public boolean isPrendido() {
        return prendido;
    }

    public void setPrendido(boolean prendido) {
        this.prendido = prendido;
    }

    public boolean isCreditoDisponible() {
        return creditoDisponible;
    }

    public void setCreditoDisponible(boolean creditoDisponible) {
        this.creditoDisponible = creditoDisponible;
    }

    @Override
    public void mensajeApoyo(Partido partido) {
        if(creditoDisponible && prendido){
            System.out.println("voten por "+partido.getNombre());
        } else {
            System.out.println("Credito insuficiente o celular apagado");
        }
    }
}

