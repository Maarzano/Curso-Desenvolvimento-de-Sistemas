//Receba um número e indique se ele é um quadrado perfeito.
package Operações_Matemáticas;

import java.util.Scanner;

public class OM5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        double raizQuadrada = Math.sqrt(num);

        if (raizQuadrada == (int) raizQuadrada) {
            System.out.println(num + " é um quadrado perfeito.");
        } else {
            System.out.println(num + " não é um quadrado perfeito.");
        }
        sc.close();
    }
}
