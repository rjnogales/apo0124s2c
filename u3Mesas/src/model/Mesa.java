package model;


public class Mesa {
    private String color;
    private int numeroDePatas;

    // Constructor
    public Mesa(String color, int numeroDePatas) {
        this.color = color;
        this.numeroDePatas = numeroDePatas;
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    // Método toString
    @Override
    public String toString() {
        return "Mesa[color=" + color + ", numeroDePatas=" + numeroDePatas + "]";
    }
}
