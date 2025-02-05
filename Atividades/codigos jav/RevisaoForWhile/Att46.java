import java.util.Scanner;

public class Att46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        int i = 1;

        System.out.println("Os primeiros 10 múltiplos de " + num + " são:");
        do {
            System.out.println(num * i);
            i++;
        } while (i <= 10);

        scanner.close();
    }
}
