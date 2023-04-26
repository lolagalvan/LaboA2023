public class Elemento {
    private boolean estado;
    private int medida;
    private int valorUmbral;
    private Fecha añoCreacion;

    public Elemento(boolean estado, int medida, int valorUmbral, Fecha añoCreacion) {
        this.estado= estado;
        this.medida = medida;
        this.valorUmbral = valorUmbral;
        this.añoCreacion = añoCreacion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public int getValorUmbral() {
        return valorUmbral;
    }

    public void setValorUmbral(int valorUmbral) {
        this.valorUmbral = valorUmbral;
    }

    public Fecha getAñoCreacion() {
        return añoCreacion;
    }

    public void setAñoCreacion(Fecha añoCreacion) {
        this.añoCreacion = añoCreacion;
    }
}
