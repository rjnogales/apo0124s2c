package model;

// Clase Gato que implementa la interfaz Animal
public class Gato implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla: ¡Miau!");
    }

    @Override
    public void moverse() {
        System.out.println("El gato salta.");
    }
}
