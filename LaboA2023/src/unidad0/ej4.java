package unidad0;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("escribir un dia de la semana" );
        String dia;
        dia = entrada.nextLine();
        switch(dia){
            case "lunes":
                System.out.println("dia laboral");
                break;
            case "martes":
                System.out.println("dia laboral");
                break;
            case "miercoles":
                System.out.println("dia laboral");
                break;
            case "jueves":
                System.out.println("dia laboral");
                break;
            case "viernes":
                System.out.println("dia laboral");
                break;
            default:      System.out.println("no es dia laboral");
        }

    }
}
