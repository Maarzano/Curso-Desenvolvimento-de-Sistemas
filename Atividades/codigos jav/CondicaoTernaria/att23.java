import java.util.Scanner;

public class att23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String senha = scanner.next();
        String resultado = (senha.length() >= 8) ? "Senha válida" : "Senha inválida";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
