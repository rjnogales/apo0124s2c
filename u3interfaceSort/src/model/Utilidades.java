package model;

// Clase con método de ordenamiento por burbuja
public class Utilidades {
    
    public static void ordenarPorBurbujaColor(ComparableItem[] items) {
        int n = items.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Comparar primero por color y luego por nombre
                if (items[j].getColor().ordinal() > items[j + 1].getColor().ordinal() ||
                    (items[j].getColor().ordinal() == items[j + 1].getColor().ordinal() )) {
                    // Intercambiar elementos
                    ComparableItem temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
    }

    public static void ordenarPorBurbujaNombre(ComparableItem[] items) {
        int n = items.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Comparar primero por color y luego por nombre
                if (items[j].getNombre().compareTo(items[j + 1].getNombre()) > 0) {
                    // Intercambiar elementos
                    ComparableItem temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
    }
}