package model;

// Clase Silla que implementa ComparableItem
public class Silla implements ComparableItem {
    private Color color;
    private String nombre;

    public Silla(Color color) {
        this.color = color;
        this.nombre = "Silla";
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " de color " + color;
    }
}