package model;

public class MesaCuadrada extends Mesa {

    public MesaCuadrada(String color, int numeroDePatas) {
        super(color, numeroDePatas);
    }

    // Método toString
    @Override
    public String toString() {
        return "MesaCuadrada " + super.toString();
    }
}