import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            /* ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner entrada = new Scanner(System.in);
        int cantidad;
        cantidad = entrada.nextInt();

        for (int i=0; i<cantidad;i++){
            int num;
            num = entrada.nextInt();
            numeros.add(num);
        }
        int suma = 0;
        for (int numero: numeros) {
            suma = numero + suma;


        }
        System.out.println("la suma es: "+ suma); */

       /*ArrayList<String> palabra = new ArrayList<String>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("cantidad: ");
        int cantidad;
        cantidad = entrada.nextInt();
        System.out.println("palabras: ");
        for (int i=0; i<cantidad;i++){

            String pal;
            pal = entrada.next();
            palabra.add(pal);
        }

        for (String palabras: palabra) {
            if (palabras.charAt(0)=='l'|| palabras.charAt(0)=='a'){
                System.out.println(palabras);
            }
        }*/


        ArrayList<Persona> persona = new ArrayList<Persona>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("cantidad: ");
        int cantidad;
        cantidad = entrada.nextInt();


        for (int i = 0; i < cantidad; i++) {
            String nombre = entrada.next();
            int edad = entrada.nextInt();
            String direccion = entrada.next();
            Persona persona1 = new Persona(nombre, edad, direccion);

        }
        for (Persona personas : persona) {
            if (personas.getEdad() > 30) {
                System.out.println(personas.imprimir());
            }

        }
    }
}


