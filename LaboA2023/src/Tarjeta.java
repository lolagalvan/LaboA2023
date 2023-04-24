public class Tarjeta extends MetodoPago {

    private int numTarjeta;
    private String banco;
    private boolean debito;
    private boolean credito;

    public Tarjeta(int numTarjeta, String banco, boolean debito, boolean credito) {
        this.numTarjeta = numTarjeta;
        this.banco = banco;
        this.debito = debito;
        this.credito = credito;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public boolean isDebito() {
        return debito;
    }

    public void setDebito(boolean debito) {
        this.debito = debito;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }
}
