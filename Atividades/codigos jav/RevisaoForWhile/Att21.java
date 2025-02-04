import java.util.Scanner;

public class Att21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int number = scanner.nextInt();
        
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        
        System.out.println("A soma dos dígitos é " + sum);
        
        scanner.close();
    }
}