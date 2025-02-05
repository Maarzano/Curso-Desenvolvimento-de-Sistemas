import java.util.Scanner;

public class att11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);
        String resultado = (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' ||
                            caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U') ? "Vogal" : "Consoante";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
