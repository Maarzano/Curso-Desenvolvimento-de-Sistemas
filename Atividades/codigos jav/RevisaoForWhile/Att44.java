import java.util.Scanner;

public class Att44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        int i = 1;

        System.out.println("Os divisores de " + num + " são:");
        do {
            if (num % i == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= num);

        scanner.close();
    }
}
