import java.util.Scanner;

public class att7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        String resultado = (numero > 0 && numero % 2 == 0) ? "Sim" : "Não";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
