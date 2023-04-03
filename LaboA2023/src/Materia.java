import java.util.ArrayList;

public class Materia {
   private String nombre;
    private ArrayList<Float> notas;

    public Materia(String nombre,ArrayList<Float> notas) {
        this.nombre= nombre;
        this.notas= notas;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Float> getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(ArrayList<Float> notas) {
        this.notas = notas;
    }

    public void agrgearnota(float nota){
        notas.add(nota);
    }

   public double promedioNotas(){
        double suma= 0;
        double promedio=0;
        for (float nota:notas) {
            suma= suma+nota;


        }
        promedio= suma/notas.size();
        return promedio;
    }


}
