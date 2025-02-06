package aula03022025.applications;

import java.util.Scanner;

import aula03022025.entities.Circle;
import aula03022025.entities.Rectangle;
import aula03022025.entities.Triangle;
import aula03022025.features.Comparador;

public class Program {
    public static void main(String[] args) {
        double a, b, c, r, areaX, areaY;
        String formato, formato1, formato2;
        Comparador comparador;

        System.out.println("Escolha uma das opções abaixo para calcular a sua área:");
        System.out.println("1. Triângulo\n2. Rectangle/Quadrado\n3. Circle");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            formato = "triângulo";
            
            System.out.println("Entre com as medidas dos lados do triângulo X: ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
            Triangle triangle = new Triangle(a, b, c);
            areaX = triangle.areaTriangle();
            
            System.out.println("Entre com as medidas dos lados do triângulo Y: ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
            triangle = new Triangle(a, b, c);
            areaY = triangle.areaTriangle();
            
            scanner.close();
            
            comparador = new Comparador(areaX, areaY, formato);
            System.out.println("Área do triângulo X: " + areaX);
            System.out.println("Área do triângulo Y: " + areaY);
            System.out.println(comparador.maiorOuIgual());
        } else if (opcao == 2) {
            System.out.println("Entre com as medidas dos lados do retângulo/quadrado X: ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            areaX = new Rectangle(a, b).areaRectangle();
            formato1 = new Rectangle(a, b).rectangleOrSquare();

            System.out.println("Entre com as medidas dos lados do retângulo/quadrado Y: ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            areaY = new Rectangle(a, b).areaRectangle();
            formato2 = new Rectangle(a, b).rectangleOrSquare();

            scanner.close();

            if (formato1 == formato2) {
                comparador = new Comparador(areaX, areaY, formato1);
                System.out.println("Área do " + formato1 + " X: " + areaX);
                System.out.println("Área do " + formato2 + " Y: " + areaY);
                System.out.println(comparador.maiorOuIgual());
            } else {
                System.out.println("Área do " + formato1 + " X: " + areaX);
                System.out.println("Área do " + formato2 + " Y: " + areaY);

                if (areaX > areaY) {
                    System.out.println("A área do " + formato1 + " X é maior.");
                } else if (areaX < areaY) {
                    System.out.println("A área do " + formato2 + " Y é maior.");
                } else {
                    System.out.println("A áreas do " + formato1 + " X e " + formato2 + " Y são iguais");
                }
            }
        } else if (opcao == 3) {
            formato = "círculo";
            System.out.println("Entre com a medida do raio do círculo X:");
            r = scanner.nextDouble();
            areaX = new Circle(r).areaCircle();

            System.out.println("Entre com a medida do raio do círculo X:");
            r = scanner.nextDouble();
            areaY = new Circle(r).areaCircle();

            scanner.close();

            comparador = new Comparador(areaX, areaY, formato);

            System.out.println("Área do círculo X: " + areaX);
            System.out.println("Área do círculo Y: " + areaY);
            System.out.println(comparador.maiorOuIgual());
        } else {
            System.out.println("O valor digatado é inválido.");
        }

    }
}
