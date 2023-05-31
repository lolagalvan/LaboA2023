package complejidad;

import java.util.ArrayList;

public class Ejercicio7 {
    ArrayList<ArrayList<Boolean>>matriz;

    public Ejercicio7(ArrayList<ArrayList<Boolean>>matriz){
        this.matriz=matriz;
    }

    public ArrayList<ArrayList<Boolean>> getMatriz() {
        return matriz;
    }

    public void setMatriz(ArrayList<ArrayList<Boolean>> matriz) {
        this.matriz = matriz;
    }

    /* ej 7 A*/
    public ArrayList<Boolean> vectorNoRepetido(ArrayList<ArrayList<Boolean>> matriz){
        int nums = 0;
        for (int i = 0;i < matriz.size(); i ++ ){
            int contador = 0;
            for (int j = 0;j < matriz.size(); j ++ ){
                if (matriz.get(i).equals(matriz.get(j))){
                    contador ++;
                }
            }
            if (contador == 1){
                nums = i;
            }
        }
        return matriz.get(nums);
    }







}
