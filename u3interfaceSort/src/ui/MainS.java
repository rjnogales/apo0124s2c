package ui;

import java.util.Random;
import model.*;

public class MainS {
    public static void main(String[] args) {
        // Crear un arreglo de 10 posiciones con sillas y mesas aleatorias
        ComparableItem[] muebles = new ComparableItem[10];
        Random random = new Random();
        
        for (int i = 0; i < muebles.length; i++) {
            if (random.nextBoolean()) { // Aleatoriamente decide si es silla o mesa
                muebles[i] = new Silla(Color.values()[random.nextInt(Color.values().length)]);
            } else {
                muebles[i] = new Mesa(Color.values()[random.nextInt(Color.values().length)]);
            }
        }

        // Mostrar el arreglo antes de ordenar
        System.out.println("Antes de ordenar:");
        for (ComparableItem mueble : muebles) {
            System.out.println(mueble);
        }

        // Ordenar el arreglo por burbuja
        Utilidades.ordenarPorBurbujaColor(muebles);

        // Mostrar el arreglo después de ordenar
        System.out.println("\nDespues de ordenar por Color:");
        for (ComparableItem mueble : muebles) {
            System.out.println(mueble);
        }
 
        // Ordenar el arreglo por burbuja
        Utilidades.ordenarPorBurbujaNombre(muebles);

        // Mostrar el arreglo después de ordenar
        System.out.println("\nDespues de ordenar por Nombre:");
        for (ComparableItem mueble : muebles) {
            System.out.println(mueble);
        }

        
    }

}
