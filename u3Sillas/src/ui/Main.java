package ui;

import java.util.Random;
import model.ConBrazos;
import model.Silla;
import model.SinBrazos;

public class Main {

    // Método de ordenamiento burbuja por color
    public static void ordenarPorColor(Silla[] sillas) {
        int n = sillas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sillas[j].getColor().compareTo(sillas[j + 1].getColor()) > 0) {
                    // Intercambiar sillas[j] y sillas[j + 1]
                    Silla temp = sillas[j];
                    sillas[j] = sillas[j + 1];
                    sillas[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Random random = new Random();
        String[] colores = {"Rojo", "Azul", "Verde", "Amarillo", "Negro", "Blanco"};

        // Crear un arreglo aleatorio de sillas
        Silla[] sillas = new Silla[10];
        for (int i = 0; i < sillas.length; i++) {
            String colorAleatorio = colores[random.nextInt(colores.length)];
            if (random.nextBoolean()) { // Decide aleatoriamente si es con brazos o sin brazos
                sillas[i] = new ConBrazos(colorAleatorio);
            } else {
                sillas[i] = new SinBrazos(colorAleatorio);
            }
        }

        System.out.println("Sillas antes de ordenar:");
        for (Silla silla : sillas) {
            System.out.println(silla);
        }

        // Ordenar las sillas por color
        ordenarPorColor(sillas);

        System.out.println("\nSillas después de ordenar:");
        for (Silla silla : sillas) {
            System.out.println(silla);
        }
    }
}