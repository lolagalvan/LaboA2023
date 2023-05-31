package alarma;

public class Elemento {
    private boolean estado;
    private int medida;
    private int umbral;
    private int anio;

    public Elemento(boolean estado, int medida, int umbral, int anio){
        this.estado = estado;
        this.medida= medida;
        this.umbral=umbral;
        this.anio=anio;
    }

    public boolean isEstado(){
        return estado;
    }
    public void setEstado(boolean estado){
        this.estado= estado;
    }
    public int getMedida(){
        return medida;
    }

    public void setMedida(int medida){
        this.medida = medida;
    }

    public int getUmbral() {
        return umbral;
    }

    public void setUmbral(int umbral) {
        this.umbral = umbral;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void verificarAlarma(){
        if (medida>umbral){
            alarma();
        }
    }

    public void alarma(){
    }

}