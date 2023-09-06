package Cosas;

/*import java.util.ArrayList;
import java.util.Scanner;
import Personas.Persona;


public class Arraylist {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    }


    ArrayList<Integer> numeros = new ArrayList<Integer>();
    int cantidad;
    System.out.println("Ingrese la cantidad de numeros que va a ingresar");
    cantidad=entrada.nextInt();
    System.out.println("Elija sus los numeros");
    for(int i=0; i<cantidad;i++){
        numeros.add(entrada.nextInt());
        entrada.nextLine();
    }
    int suma = 0;
        for (Integer numero : numeros) {
        suma = suma + numero;
    }
        System.out.println(suma);



        System.out.println("Elija con que letra debe coincidir la inicial");
    String letraIndicada = entrada.nextLine();
    String frase;
    ArrayList<String> palabras = new ArrayList<String>();
        System.out.println("Ingrese la cantidad de nombres que va a ingresar");
    cantidad=entrada.nextInt();
        entrada.nextLine();
        System.out.println("Elija sus " + cantidad + " nombres");
        for(int i=0; i<cantidad;i++){
        frase=entrada.nextLine();
        palabras.add(frase);
    }
        for (String palabra : palabras) {
        if (palabra.charAt(0) == letraIndicada.charAt(0)) {
            System.out.println(palabra);
        }
    }


    ArrayList<Personas.Persona>personas=new ArrayList<Personas.Persona>();

        System.out.println("Ingrese la cantidad de nombres que va a ingresar");
    cantidad=entrada.nextInt();
        System.out.println("Elija sus  nombres con sus respectivas edades");
    String nombre;
    int edad;
        for(int i=0; i<cantidad;i++){
        nombre=entrada.next();
        edad=entrada.nextInt();
        entrada.nextLine();
        Personas.Persona persona1 = new Personas.Persona(nombre, edad);
        personas.add(persona1);
    }
        for(Personas.Persona persona:personas){
        if(persona.getEdad()>30){
            persona.imprimir();
        }
    }

}*/
