public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo();
            circulo.setRadio(2);
            double radio = circulo.getRadio();
            double area= circulo.area((int) radio);
            System.out.println(area);
            double area2= circulo.area2((int) radio);
            System.out.println(area2);

    }
}