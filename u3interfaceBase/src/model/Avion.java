package model;

// Clase Avion que implementa la interfaz Volador
public class Avion implements Volador {
    @Override
    public void volar() {
        System.out.println("El avión vuela a gran velocidad.");
    }
}