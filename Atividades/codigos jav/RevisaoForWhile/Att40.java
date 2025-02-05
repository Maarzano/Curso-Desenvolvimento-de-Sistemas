import java.util.Scanner;

public class Att40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int num;

        do {
            System.out.println("Digite um número:");
            num = scanner.nextInt();
            count++;
        } while (num != 0);

        System.out.println("Você digitou " + (count - 1) + " números antes do zero.");
        scanner.close();
    }
}
