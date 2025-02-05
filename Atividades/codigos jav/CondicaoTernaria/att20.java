import java.util.Scanner;

public class att20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota: ");
        double nota = scanner.nextDouble();
        String resultado = (nota >= 7) ? "Aprovado" : (nota >= 5) ? "Recuperação" : "Reprovado";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
