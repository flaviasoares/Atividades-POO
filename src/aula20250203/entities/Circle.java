package aula20250203.entities;

public class Circle {
    private double r;
    private double pi = 3.14159;

    public Circle (double r) {
        this.r = r;
    }

    public double areaCircle() {
        return pi * Math.pow(r, 2);
    }
    
}
