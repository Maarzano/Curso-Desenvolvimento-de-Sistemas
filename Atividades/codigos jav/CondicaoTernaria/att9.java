import java.util.Scanner;

public class att9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        String resultado = (num1 > num2) ? "Maior" : "Menor ou Igual";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
