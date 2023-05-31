package complejidad;
import java.util.ArrayList;

public class Ejercicio6 {
    private ArrayList<Integer>vector;

    public Ejercicio6(ArrayList<Integer> vector) {
        this.vector = vector;
    }

    public ArrayList<Integer> getVector() {
        return vector;
    }

    public void setVector(ArrayList<Integer> vector) {
        this.vector = vector;
    }


    public Ejercicio6() {
        vector = new ArrayList<Integer>();
    }

    public int mesetaMasLarga () {
        int i = 0;
        int maxMeseta = 0;
        int cant=0;
        int siguiente = 0;
        while ( i < vector.size () -1 ) {

            siguiente = i + 1;
            if(siguiente< vector.size() && vector.get(i)%2==1){
                cant++;
            }
            else{
                if(cant>maxMeseta){
                    maxMeseta = cant;
                }
            }
            i ++;
        }
        return maxMeseta;
    }

}
