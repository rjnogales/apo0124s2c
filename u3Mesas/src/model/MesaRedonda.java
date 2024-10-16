package model;

public class MesaRedonda extends Mesa {
    
    public MesaRedonda(String color, int numeroDePatas) {
        super(color, numeroDePatas);
    }

    // Método toString
    @Override
    public String toString() {
        return "MesaRedonda " + super.toString();
    }
}