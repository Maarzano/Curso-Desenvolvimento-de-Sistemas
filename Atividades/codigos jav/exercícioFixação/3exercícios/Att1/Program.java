import java.util.Scanner;

import Models.Rectangle;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da altura do retângulo: ");
        double altura = sc.nextDouble();
        System.out.print("Agora digite o valor da largura do retângulo: ");
        double largura = sc.nextDouble();

        Rectangle retangulo = new Rectangle(altura, largura);

        System.out.println("Area: " + retangulo.Area());
        System.out.println("Permetro: " + retangulo.Perimeter());
        System.out.println("Diagonal: " + retangulo.Diagonal());

        sc.close();
    }
}
