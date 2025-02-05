import java.util.Scanner;

public class Att47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        int i = 2;
        boolean isPrime = true;

        do {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        } while (i <= num / 2);

        if (isPrime && num > 1) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }

        scanner.close();
    }
}
