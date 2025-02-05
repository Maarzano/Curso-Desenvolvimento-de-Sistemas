import java.util.Scanner;

public class Att48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("Digite um número (digite 0 para sair):");
            num = scanner.nextInt();

            if (num != 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " é par.");
                } else {
                    System.out.println(num + " é ímpar.");
                }
            }

        } while (num != 0);

        scanner.close();
    }
}
