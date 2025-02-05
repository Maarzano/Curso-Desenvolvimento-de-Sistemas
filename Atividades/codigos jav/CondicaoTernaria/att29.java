import java.util.Scanner;

public class att29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        String resultado = (idade >= 18 && idade <= 60) ? "Adulto" : (idade > 60) ? "Idoso" : "Jovem";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
