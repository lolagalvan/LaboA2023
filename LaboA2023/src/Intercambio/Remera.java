package Intercambio;



public class Remera extends Prenda {
    private float espalda;
    private float contorno;
    private float torso;

    public Remera(String color, Material material, String marca, String estado, float espalda, float contorno, float torso) {
        super(color, material, marca, estado);
        this.espalda = espalda;
        this.contorno = contorno;
        this.torso = torso;
    }

    public float getEspalda() {
        return espalda;
    }

    public void setEspalda(float espalda) {
        this.espalda = espalda;
    }

    public float getContorno() {
        return contorno;
    }

    public void setContorno(float contorno) {
        this.contorno = contorno;
    }

    public float getTorso() {
        return torso;
    }

    public void setTorso(float torso) {
        this.torso = torso;
    }

    public String toString(){
        String remera = "color: "+getColor()+"material: "+getMaterial()+"marca: "+getMarca()+"estado: "+getEstado()+"medidas: "+"torso: " + getTorso() +"contorno: " + getContorno()+ "espalda: "+ getEspalda() ;
        return remera;
    }


    @Override
    public boolean prestar() {
        boolean prestable = false;
        if(getEstado().equals("roto")|| getEstado().equals("manchado")){
            System.out.println("La remera no se prestara");
        }else{
            System.out.println("La remera se prestara");
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
