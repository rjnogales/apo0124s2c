package model;

// Clase Mesa que implementa ComparableItem
public class Mesa implements ComparableItem {
    private Color color;
    private String nombre;

    public Mesa(Color color) {
        this.color = color;
        this.nombre = "Mesa";
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