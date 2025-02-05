import java.util.Scanner;

public class att15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        String resultado = (numero % 3 == 0 && numero % 5 == 0) ? "FizzBuzz" : String.valueOf(numero);
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
