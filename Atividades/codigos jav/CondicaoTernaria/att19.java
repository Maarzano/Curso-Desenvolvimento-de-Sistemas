import java.util.Scanner;

public class att19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        String resultado = (numero % 2 == 0 || numero % 3 == 0) ? "Divisível" : "Não divisível";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
