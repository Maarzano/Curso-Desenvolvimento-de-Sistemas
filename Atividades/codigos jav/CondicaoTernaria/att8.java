import java.util.Scanner;

public class att8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota: ");
        double nota = scanner.nextDouble();
        String resultado = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
