package Program;

import Models.Triangulo;
import java.util.Scanner;
import static Models.Triangulo.VerificarMaiorArea;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura do  1° triângulo: ");
        double altura = sc.nextDouble();

        System.out.print("Digite a base do 1° triângulo: ");
        double base = sc.nextDouble();

        Triangulo triangulo1 = new Triangulo(altura, base);

        System.out.print("Digite a altura do  2° triângulo: ");
        double altura2 = sc.nextDouble();

        System.out.print("Digite a base do 2° triângulo: ");
        double base2 = sc.nextDouble();

        sc.close();

        Triangulo triangulo2 = new Triangulo(altura2, base2);

        System.out.println(VerificarMaiorArea(triangulo1, triangulo2));
    }
}
