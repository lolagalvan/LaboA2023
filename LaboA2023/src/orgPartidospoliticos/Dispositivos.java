package orgPartidospoliticos;

public class Dispositivos {

        private int numeroSerie;
        private String fabricante;
        private String modelo;

        public Dispositivos(int numeroSerie, String fabricante, String modelo) {
            this.numeroSerie = numeroSerie;
            this.fabricante = fabricante;
            this.modelo = modelo;
        }

        public int getNumeroSerie() {
            return numeroSerie;
        }

        public void setNumeroSerie(int numeroSerie) {
            this.numeroSerie = numeroSerie;
        }

        public String getFabricante() {
            return fabricante;
        }

        public void setFabricante(String fabricante) {
            this.fabricante = fabricante;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
    }

