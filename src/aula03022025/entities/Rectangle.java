package aula03022025.entities;

public class Rectangle {
    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double areaRectangle() {
        return this.a * this.b;
    }

    public String rectangleOrSquare() {
        if (this.a == this.b) {
            return "quadrado";
        } else {
            return "retângulo";
        }
    }
}
