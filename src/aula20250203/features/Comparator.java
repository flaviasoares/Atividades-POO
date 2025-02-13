package aula20250203.features;

public class Comparator {
    public static String maiorOuIgual(double areaX, double areaY, String formato) {
        if (areaX > areaY) {
            return "A área do " + formato + " X é maior.";
        } else if (areaX < areaY) {
            return "A área do " + formato + " Y é maior.";
        } else {
            return "As áreas dos " + formato + "s são iguais.";
        }
    }
}
