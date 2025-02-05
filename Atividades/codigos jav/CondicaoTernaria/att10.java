import java.util.Scanner;

public class att10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        String resultado = (numero > 100) ? "Alto" : "Baixo";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
