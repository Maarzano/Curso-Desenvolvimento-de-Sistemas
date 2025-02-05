import java.util.Scanner;

public class Att42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String input = scanner.nextLine();

        int i = input.length() - 1;
        do {
            System.out.print(input.charAt(i));
            i--;
        } while (i >= 0);

        scanner.close();
    }
}
