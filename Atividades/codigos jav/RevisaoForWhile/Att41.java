import java.util.Scanner;

public class Att41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String input = scanner.nextLine();

        int i = 0;
        do {
            System.out.println(input.charAt(i));
            i++;
        } while (i < input.length());

        scanner.close();
    }
}
