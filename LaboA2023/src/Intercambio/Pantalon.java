package Intercambio;
public class Pantalon extends Prenda {
    private float cadera;
    private float cintura;
    private float largo;

    public Pantalon(String color, Material material, String marca, String estado, float cadera, float cintura, float largo) {
        super(color, material, marca, estado);
        this.cadera = cadera;
        this.cintura = cintura;
        this.largo = largo;
    }

    public float getCadera() {
        return cadera;
    }

    public void setCadera(float cadera) {
        this.cadera = cadera;
    }

    public float getCintura() {
        return cintura;
    }

    public void setCintura(float cintura) {
        this.cintura = cintura;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public String toString(){
        String pantalon = "color: "+getColor()+"material: "+getMaterial()+"marca: "+getMarca()+"estado: "+getEstado()+"medidas: "+"cadera: " + getCadera() +"cintura: " + getCintura() + "largo: "+ getLargo() ;
        return pantalon;
    }


    @Override
    public boolean prestar() {
        boolean prestable = false;
        if(getEstado().equals("roto")|| getEstado().equals("manchado")){
            System.out.println("El pantalon no se prestara");

        }else{
            System.out.println("El pantalon se prestara");
            prestable = true;
        }
        return prestable;
    }

    @Override
    public boolean agregarElemento() {
        boolean agregado = false;
        if(prestar() == true){
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
            agregado = true;
        }else {
            System.out.println("El articulo ingresado no podrá ingresar a nuestro sistema");
        }
        return agregado;
    }
}
