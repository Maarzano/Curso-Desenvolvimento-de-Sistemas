import java.util.Scanner;

public class att26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        String resultado = (idade >= 16) ? "Pode votar" : "Não pode votar";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
