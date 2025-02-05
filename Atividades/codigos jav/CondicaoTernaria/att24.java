import java.util.Scanner;

public class att24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int somaDivisores = 0;
        
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }
        
        String resultado = (somaDivisores == numero) ? "Perfeito" : "Não perfeito";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
