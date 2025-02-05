import java.util.Scanner;

public class att12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        String resultado = (numero % 2 == 0 && numero > 0) ? "Par e Positivo" : 
                           (numero % 2 == 0 && numero < 0) ? "Par e Negativo" : 
                           (numero % 2 != 0 && numero > 0) ? "Ímpar e Positivo" : "Ímpar e Negativo";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
