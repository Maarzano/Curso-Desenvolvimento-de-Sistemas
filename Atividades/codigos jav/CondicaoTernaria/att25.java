import java.util.Scanner;

public class att25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia da semana (1 para segunda-feira, 7 para domingo): ");
        int dia = scanner.nextInt();
        String resultado = (dia >= 1 && dia <= 5) ? "Dia útil" : "Final de semana";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
