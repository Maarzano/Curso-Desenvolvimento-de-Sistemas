import java.util.Scanner;

public class Att19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int number = scanner.nextInt();
        
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        System.out.println("O fatorial de " + number + " é " + factorial);
        
        scanner.close();
    }
}