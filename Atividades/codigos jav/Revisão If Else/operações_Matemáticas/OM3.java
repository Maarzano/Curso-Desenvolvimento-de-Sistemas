//Receba dois números e indique se um é divisível pelo outro.
package operações_Matemáticas;

import java.util.Scanner;

public class OM3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = sc.nextInt();

        if (num % num2 == 0) {
            System.out.println("O primeiro número é divisível pelo segundo");
        } else {
            System.out.println("O primeiro número não é divisível pelo segundo");
        }
        sc.close();
    }
}
