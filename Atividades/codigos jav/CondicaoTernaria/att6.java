import java.util.Scanner;

public class att6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        System.out.print("Tem carteira de motorista? (true/false): ");
        boolean temCarteira = scanner.nextBoolean();
        String resultado = (idade >= 18 && temCarteira) ? "Pode dirigir" : "Não pode dirigir";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
