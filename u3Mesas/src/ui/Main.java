package ui;

import java.util.Random;
import model.Mesa;
import model.MesaCuadrada;
import model.MesaRedonda;

public class Main {

    // Método de ordenamiento burbuja por tipo de mesa
    public static void ordenarPorTipo(Mesa[] mesas) {
        int n = mesas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (mesas[j] instanceof MesaCuadrada && mesas[j + 1] instanceof MesaRedonda) {
                    // Intercambiar mesas[j] y mesas[j + 1]
                    Mesa temp = mesas[j];
                    mesas[j] = mesas[j + 1];
                    mesas[j + 1] = temp;
                }
            }
        }
    }

    public static void ordenarPorColor(Mesa[] mesas) {
        int n = mesas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (mesas[j].getColor().compareTo(mesas[j + 1].getColor()) > 0) {
                    // Intercambiar mesas[j] y mesas[j + 1]
                    Mesa temp = mesas[j];
                    mesas[j] = mesas[j + 1];
                    mesas[j + 1] = temp;
                }
            }
        }
    }

    public static void ordenarPorNumeroDePatas(Mesa[] mesas) {
        int n = mesas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (mesas[j].getNumeroDePatas() > mesas[j + 1].getNumeroDePatas()) {
                    // Intercambiar mesas[j] y mesas[j + 1]
                    Mesa temp = mesas[j];
                    mesas[j] = mesas[j + 1];
                    mesas[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        String[] colores = {"Rojo", "Azul", "Verde", "Amarillo", "Negro", "Blanco"};

        // Crear un arreglo aleatorio de mesas
        Mesa[] mesas = new Mesa[10];
        for (int i = 0; i < mesas.length; i++) {
            String colorAleatorio = colores[random.nextInt(colores.length)];
            int patasAleatorias = random.nextInt(3) + 3; // Número de patas entre 3 y 5

            if (random.nextBoolean()) { // Decide aleatoriamente si es redonda o cuadrada
                mesas[i] = new MesaRedonda(colorAleatorio, patasAleatorias);
            } else {
                mesas[i] = new MesaCuadrada(colorAleatorio, patasAleatorias);
            }
        }

        System.out.println("Mesas antes de ordenar:");
        for (Mesa mesa : mesas) {
            System.out.println(mesa);
        }

        // Ordenar las mesas por tipo (redonda o cuadrada)
        ordenarPorTipo(mesas);

        System.out.println("\nMesas después de ordenar por Tipo:");
        for (Mesa mesa : mesas) {
            System.out.println(mesa);
        }

        ordenarPorColor(mesas);

        System.out.println("\nMesas después de ordenar por Color:");
        for (Mesa mesa : mesas) {
            System.out.println(mesa);
        }

        ordenarPorNumeroDePatas(mesas);

        System.out.println("\nMesas después de ordenar:");
        for (Mesa mesa : mesas) {
            System.out.println(mesa);
        }
    }
}