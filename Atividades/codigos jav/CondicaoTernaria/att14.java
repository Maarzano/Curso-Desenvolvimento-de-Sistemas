import java.util.Scanner;

public class att14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        String resultado = (numero >= 10 && numero <= 50) ? "Dentro do intervalo" : "Fora do intervalo";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
