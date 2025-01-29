package Operações_Matemáticas;

import java.util.Scanner;

public class OM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = sc.nextInt();

        if (num / num2 < 0) {
            System.out.println("O resultado da divisão é negativo");
        } else {
            System.out.println("O resultado da divisão é positivo");
            
        }
        sc.close();
    }
}
