package aula03022025.features;

public class Comparador {
    private double areaX, areaY;
    private String formato;

    public Comparador(double areaX, double areaY, String formato) {
        this.areaX = areaX;
        this.areaY = areaY;
        this.formato = formato;
    }

    public String maiorOuIgual() {
        if (this.areaX > this.areaY) {
            return "A área do " + this.formato + " X é maior.";
        } else if (this.areaX < this.areaY) {
            return "A área do " + this.formato + " Y é maior.";
        } else {
            return "A áreas dos " + this.formato + " s são iguais";
        }
    }
}
