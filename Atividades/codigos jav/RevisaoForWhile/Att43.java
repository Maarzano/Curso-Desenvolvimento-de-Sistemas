import java.util.Scanner;

public class Att43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        int sum = 0;

        do {
            sum += num % 10;
            num /= 10;
        } while (num > 0);

        System.out.println("A soma dos dígitos é: " + sum);
        scanner.close();
    }
}
