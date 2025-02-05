import java.util.Scanner;

public class Att50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "12345";
        String password;

        do {
            System.out.println("Digite a senha:");
            password = scanner.nextLine();

            if (!password.equals(correctPassword)) {
                System.out.println("Senha incorreta, tente novamente.");
            }

        } while (!password.equals(correctPassword));

        System.out.println("Senha correta!");

        scanner.close();
    }
}
