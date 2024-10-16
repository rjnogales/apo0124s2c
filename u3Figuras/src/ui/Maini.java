package ui;

import model.Organiza;
import model.Figura;
import model.Triangulo;
import model.Circulo;
import model.Rectangulo;
import model.Cuadrado;
import java.util.Random;


public class Maini {

   public static void main(String[] args) {

       Figura[] figuras = new Figura[10];
       Random random = new Random();

       // Instanciar figuras aleatorias
       for (int i = 0; i < figuras.length; i++) {
           int tipoFigura = random.nextInt(4); // Genera un número entre 0 y 3

           switch (tipoFigura) {
               case 0: // Triángulo
                   figuras[i] = new Triangulo(random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
                   break;
               case 1: // Rectángulo
                   figuras[i] = new Rectangulo(random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
                   break;
               case 2: // Cuadrado
                   figuras[i] = new Cuadrado(random.nextDouble() * 10 + 1);
                   break;
               case 3: // Círculo
                   figuras[i] = new Circulo(random.nextDouble() * 10 + 1);
                   break;
           }
       }

       System.out.println("Figuras antes de ordenar:");
       for (Figura figura : figuras) {
           System.out.println(figura);
       }

      
   }

    public static void ordenarBurbuja(Object[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j].compararArea(arreglo[j + 1]) > 0 ) {
                    // Intercambiar arreglo[j] y arreglo[j + 1]
                    Object temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
}
