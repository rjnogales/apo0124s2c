package model;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super("Rectángulo", 4);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

   @Override
   public int compararArea(Figura otraFigura) {
       return Double.compare(this.calcularArea(), otraFigura.calcularArea());
   }

   // Getters y Setters
   public double getBase() {
       return base;
   }

   public void setBase(double base) {
       this.base = base;
   }

   public double getAltura() {
       return altura;
   }

   public void setAltura(double altura) {
       this.altura = altura;
   }
}
