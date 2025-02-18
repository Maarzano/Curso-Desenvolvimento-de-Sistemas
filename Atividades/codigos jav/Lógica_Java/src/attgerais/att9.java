package attgerais;
import java.util.Scanner;

class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensagem) {
        super(mensagem);
    }
}

public class att9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número positivo: ");
            int numero = Integer.parseInt(scanner.nextLine());

            if (numero < 0) {
                throw new NumeroNegativoException("Erro: O número não pode ser negativo.");
            }

            System.out.println("Número digitado: " + numero);
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, insira um número válido.");
        }
    }
}
