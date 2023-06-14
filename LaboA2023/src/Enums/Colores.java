package Enums;

public enum Colores {
    AQUA("00FFF"), BLANCO("FFFFFF"), AZUL("0000FF"), FUCSIA("FF00FF"), VERDE("008000");
    private String codigo;

    private Colores(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}