package alarma;

import alarma.*;

import java.util.ArrayList;
import java.util.Scanner;

public class mainAlarma {
    public static void main(String[] args) {
        ArrayList<Elemento>sensores=new ArrayList<>();
        Temperatura t1 = new Temperatura(true,50,100,2015);
        Temperatura t2 = new Temperatura(true,90,100,2015);
        Temperatura t3 = new Temperatura(true,110,100,2015);
        Presion p1 = new Presion(true,50,100,2015);
        Presion p2 = new Presion(true,90,100,2015);
        Presion p3 = new Presion(true,110,100,2015);
        Humo h1 = new Humo(true,50,100,2015);
        Humo h2 = new Humo(true,90,100,2015);
        Humo h3 = new Humo(true,110,100,2015);
        sensores.add(t1);
        sensores.add(t2);
        sensores.add(t3);
        sensores.add(p1);
        sensores.add(p2);
        sensores.add(p3);
        sensores.add(h1);
        sensores.add(h2);
        sensores.add(h3);

        try {
            System.out.println("Ingrese un sensor");
            Scanner entrada=new Scanner(System.in);
            int aux=entrada.nextInt();
            System.out.println(sensores.get(aux));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("No existe ese sensor");
        }

        t1.alarma();
        t2.alarma();
        t3.alarma();

        p1.alarma();
        p2.alarma();

        p3.alarma();

        h1.alarma();
        h2.alarma();
        h3.alarma();
        Complejo c1= new Complejo(sensores,40,20);
        c1.verificarAlarmas();
    }
}
