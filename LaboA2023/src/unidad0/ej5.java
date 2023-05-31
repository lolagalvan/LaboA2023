package unidad0;

public class ej5 {
    public static void main(String[] args) {
        String frase = "ayer me compre muñecos de la marca colchitas por internet";
        int vocales = 0;
        for (int i=0;i<frase.length();i++){
            if (frase.charAt(i)== 'a' || frase.charAt(i)== 'e' || frase.charAt(i)== 'i' || frase.charAt(i)== 'o' || frase.charAt(i)== 'u' ){
                vocales = vocales +1;
            }
        }
        System.out.println(vocales);
    }
}
