package model;

public abstract class Figura implements Organiza, Comparable<Figura> {

    protected String nombreFigura;
    protected int numeroDeLados;

    public Figura(String nombreFigura, int numeroDeLados) {
        this.nombreFigura = nombreFigura;
        this.numeroDeLados = numeroDeLados;
    }

    public abstract double calcularArea();

    @Override
    public String toString() {
        return String.format("%s (lados: %d, área: %.2f)", nombreFigura, numeroDeLados, calcularArea());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Figura)) return false;
        Figura figura = (Figura) obj;
        return Double.compare(figura.calcularArea(), this.calcularArea()) == 0;
    }

    @Override
    public int compareTo(Figura otraFigura) {
        return Double.compare(this.calcularArea(), otraFigura.calcularArea());
    }
}
