package formas;

public class Circulo {

        private int radio;
        public Circulo(){
                this.radio = 2;
        }
        public Circulo(int rd){
                radio = rd;

        }
        public int getRadio(){
                return radio;
        }

        public void setRadio(int radio) {
                this.radio = radio;
        }
        public double area(int radio){
                double area= Math.PI*radio*radio;
                return area;
        }

        public double area2(int radio){
                double a= 2*Math.PI*radio;
                return a;
        }





}
