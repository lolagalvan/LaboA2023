public class ExepcionesThrow {
    public static void main(String[] args) {


    String nombre = null;
        try {
        if (nombre==null){
            throw new NullPointerException("Error, el nombre es null");
        }
        System.out.println("El largo del nombre es:"+ nombre.length());
    }
        catch (NullPointerException e){
        System.out.println(e.getMessage() + " firma: Galvan - Mlikota");
    }

}
}
