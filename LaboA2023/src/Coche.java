public class Coche {

    private String marca;
    private String modelo;
    private String color;

    private int velocidad;



    public void Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public void acelerar(){
        setVelocidad(this.velocidad + 1);

    }
    public void frenar(){
        setVelocidad(this.velocidad - 1);

    }
    public int getVelocidad() {
        return velocidad;
    }
}



