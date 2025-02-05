import java.util.Scanner;

public class Att45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor máximo da sequência de Fibonacci:");
        int max = scanner.nextInt();

        int a = 0, b = 1;

        System.out.println("Sequência de Fibonacci:");
        do {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        } while (a <= max);

        scanner.close();
    }
}
