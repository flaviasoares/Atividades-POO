package aula03022025.entities;

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double areaTriangle() {
        double p, area;
        p = (this.a + this.b + this.c) / 2;
        area = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        return area;
    }
}
