import java.util.Scanner;

public class Att39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        do {
            System.out.println("Informe um número:");
            num = scanner.nextInt();
            if (num >= 0) {
                System.out.println("Número positivo: " + num);
            }
        } while (num >= 0);

        scanner.close();
    }
}
