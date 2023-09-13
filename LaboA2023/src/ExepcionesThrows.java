public class ExepcionesThrows{
    public static void main(String[] args) throws NullPointerException {
        try {
            String nombre = null;
            System.out.println("El largo del nombre es:"+ nombre.length());
        }
        catch (NullPointerException e){
            System.out.println(" el nombre es null" + " firma: Galvan - Mlikota");
        }
    }


}
