package model;

public class Arreglos {

    private int[] arreglo;

    // Constructor que recibe un arreglo
    public Arreglos(int[] arreglo) {
        this.arreglo = arreglo;
    }

    // Método para representar el arreglo como una cadena
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arreglo.length; i++) {
            sb.append(arreglo[i]);
            if (i < arreglo.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Método de ordenamiento burbuja
    public void ordenarBurbuja() {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar arreglo[j] y arreglo[j + 1]
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    // Método principal para probar la clase Arreglos
    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 6, 2, 7, 4, 1};
        Arreglos misArreglos = new Arreglos(numeros);

        System.out.println("Arreglo original: " + misArreglos);
        
        misArreglos.ordenarBurbuja();
        
        System.out.println("Arreglo ordenado: " + misArreglos);
    }
}
