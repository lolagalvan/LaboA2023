package complejidad;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

/* ej 8
        ArrayList<Integer> vector1 = new ArrayList<Integer>();
        ArrayList<Integer> vector2 = new ArrayList<Integer>();
        ArrayList<Integer> vectorNuevo = new ArrayList<Integer>();

        vector1.add(1);
        vector1.add(2);
        vector1.add(5);

        vector2.add(3);
        vector2.add(4);
        vector2.add(6);

        int i = 0;
        int j = 0;
        while (i < vector1.size()) {
            if ( j < vector2.size() && vector1.get(i) >= vector2.get(j) ) {
                vectorNuevo.add(vector2.get(j));
                j++;
            } else {
                vectorNuevo.add(vector1.get(i));
                i ++;
            }

        }
        if (i < j) {
            int resta = j - i;
            int a = 0;
            while (a < resta) {
                vectorNuevo.add(vector2.get(vector1.size() + a));
                a++;
            }
        }
        System.out.println(vectorNuevo);
*/
        /* ej 10

        ArrayList<Integer> vector1 = new ArrayList<Integer>();
        ArrayList<Integer> vectorNuevo = new ArrayList<Integer>();

        vector1.add(1);
        vector1.add(2);
        vector1.add(1);
        vector1.add(3);
        vector1.add(3);


        int uno=0;
        int dos = 0;
        int tres=0;
        for(int i=1;i< vector1.size();i++){
                if (vector1.get(i)==1){
                    uno ++;
                }
                else if(vector1.get(i)==2){
                    dos ++;
                }
                else if (vector1.get(i)==3){
                    tres ++;
                }
            }

            for(int i=0; i<uno;i++){
                vectorNuevo.add(1);
            }
            int temporal = vectorNuevo.size();
            for(int i=temporal-1; i<(temporal+dos-1);i++){
                vectorNuevo.add(2);
            }
            temporal = vectorNuevo.size();
        for(int i=temporal-1; i<(temporal+tres-1);i++){
            vectorNuevo.add(3);
        }

        System.out.println(vectorNuevo);

*/
            }
        }

