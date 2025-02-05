import java.util.Scanner;

public class Att54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num;

        do {
            System.out.println("Digite um número (digite um número negativo para sair):");
            num = scanner.nextDouble();

            if (num >= 0) {
                System.out.println("A raiz quadrada de " + num + " é: " + Math.sqrt(num));
            }

        } while (num >= 0);

        scanner.close();
    }
}
