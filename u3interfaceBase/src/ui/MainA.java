package ui;

import model.Animal;
import model.Gato;
import model.Perro;

public class MainA {
    public static void main(String[] args) {
        // Crear instancias de Perro y Gato
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        // Llamar a los métodos de cada animal
        miPerro.hacerSonido();
        miPerro.moverse();

        miGato.hacerSonido();
        miGato.moverse();
    }
}
