package model;

// Clase Perro que implementa la interfaz Animal
public class Perro implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau!");
    }

    @Override
    public void moverse() {
        System.out.println("El perro corre.");
    }
}
