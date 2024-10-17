package model;

// Clase Pajaro que implementa la interfaz Volador
public class Pajaro implements Volador {
    @Override
    public void volar() {
        System.out.println("El pájaro vuela alto en el cielo.");
    }
}
