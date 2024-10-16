package model;

public class SinBrazos extends Silla {
    public SinBrazos(String color) {
        super(color);
    }

    // Método toString
    @Override
    public String toString() {
        return "SinBrazos " + super.toString();
    }
}