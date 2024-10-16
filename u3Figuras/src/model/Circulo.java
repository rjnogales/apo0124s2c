package model;

public class Circulo extends Figura {

   private double radio;

   public Circulo(double radio) {
       super("Círculo", 0);
       this.radio = radio;
   }

   @Override
   public double calcularArea() {
       return Math.PI * Math.pow(radio, 2);
   }

   @Override
   public int compararArea(Figura otraFigura) {
       return Double.compare(this.calcularArea(), otraFigura.calcularArea());
   }

   // Getters y Setters
   public double getRadio() {
       return radio;
   }

   public void setRadio(double radio) {
       this.radio = radio;
   }
}

