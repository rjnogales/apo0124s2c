package ui;

import model.Operacion;
import model.Suma;
import model.Resta;

public class Main {
    
    public static void main(String[] args) {
        Operacion suma = new Suma(10, 5);
        Operacion resta = new Resta(10, 5);
        
        suma.operar();
        suma.imprimir(); // Salida: 15
        
        resta.operar();
        resta.imprimir(); // Salida: 5
    }
}
