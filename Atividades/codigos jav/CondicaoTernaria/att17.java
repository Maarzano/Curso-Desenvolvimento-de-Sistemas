import java.util.Scanner;

public class att17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        System.out.print("É estudante? (true/false): ");
        boolean estudante = scanner.nextBoolean();
        String resultado = (idade > 60 || estudante) ? "Qualificado para o desconto" : "Não qualificado para o desconto";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
