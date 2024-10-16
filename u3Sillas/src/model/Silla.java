package model;

public class Silla {
    private String color;

    // Constructor
    public Silla(String color) {
        this.color = color;
    }

    // Getter y Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método toString
    @Override
    public String toString() {
        return "Silla[color=" + color + "]";
    }
}
