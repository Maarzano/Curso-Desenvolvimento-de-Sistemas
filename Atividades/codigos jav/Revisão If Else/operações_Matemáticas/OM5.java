//Receba um número e indique se ele é um quadrado perfeito.
package operações_Matemáticas;

import java.util.Scanner;

public class OM5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if (num * num == (num^2)) {
            System.out.println("O número é um quadrado perfeito");
        } else {
            System.out.println("O número não é um quadrado perfeito");
        }
        sc.close();
    }
}
