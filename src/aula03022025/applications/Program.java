package aula03022025.applications;

import java.util.Scanner;

import aula03022025.entities.Circle;
import aula03022025.entities.Rectangle;
import aula03022025.entities.Triangle;
import aula03022025.features.Comparator;

public class Program {
    public static void main(String[] args) {
        double a, b, c, r, areaX, areaY;
        String formato, formato1, formato2;

        System.out.println("Escolha uma das opções abaixo para calcular a sua área:");
        System.out.println("1. Triângulo\n2. Retângulo/Quadrado\n3. Círculo");
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
            System.out.printf("Área do triângulo X: %.2f\n", areaX);
            System.out.printf("Área do triângulo Y: %.2f\n", areaY);
            System.out.println(Comparator.maiorOuIgual(areaX, areaY, formato));
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
                System.out.printf("Área do %s X: %.2f\n", formato1, areaX);
                System.out.printf("Área do %s Y: %.2f\n", formato2, areaY);
                System.out.println(Comparator.maiorOuIgual(areaX, areaY, formato1));
            } else {
                System.out.printf("Área do %s X: %.2f\n", formato1, areaX);
                System.out.printf("Área do %s Y: %.2f\n", formato2, areaY);

                if (areaX > areaY) {
                    System.out.printf("A área do %s é maior.\n", formato1);
                } else if (areaX < areaY) {
                    System.out.printf("A área do %s é maior.\n", formato2);
                } else {
                    System.out.printf("As áreas do %s e %s são iguais.\n", formato1, formato2);
                }
            }
        } else if (opcao == 3) {
            formato = "círculo";
            System.out.println("Entre com a medida do raio do círculo X:");
            r = scanner.nextDouble();
            areaX = new Circle(r).areaCircle();

            System.out.println("Entre com a medida do raio do círculo Y:");
            r = scanner.nextDouble();
            areaY = new Circle(r).areaCircle();

            scanner.close();

            System.out.printf("Área do círculo X: %.2f\n", areaX);
            System.out.printf("Área do círculo Y: %.2f\n", areaY);
            System.out.println(Comparator.maiorOuIgual(areaX, areaY, formato));
        } else {
            System.out.println("O valor digatado é inválido.");
        }
    }
}
