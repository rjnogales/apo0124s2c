package ui;

import model.Volador;
import model.Avion;
import model.Pajaro;
import model.Mosca;

public class MainV {
    public static void main(String[] args) {
        // Crear instancias de Mosca, Pajaro y Avion
        Volador miMosca = new Mosca();
        Volador miPajaro = new Pajaro();
        Volador miAvion = new Avion();

        // Llamar al método volar de cada objeto
        miMosca.volar();
        miPajaro.volar();
        miAvion.volar();
    }
}