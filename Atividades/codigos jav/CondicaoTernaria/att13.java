import java.util.Scanner;

public class att13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        int maior = (num1 > num2) ? num1 : num2;
        System.out.println("O maior número é: " + maior);
        scanner.close();
    }
}
