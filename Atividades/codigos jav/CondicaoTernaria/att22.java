import java.util.Scanner;

public class att22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        String resultado = (valorProduto >= 100) ? "Frete grátis" : "Sem frete grátis";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
