// Receba dois números e indique se sua soma é maior que 100.
package Métodos5Escolhidos;

import java.util.Scanner;

public class Att5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escvre o 1° número");
        int num1 = sc.nextInt();

        System.out.println("Escreva o 2° número");
        int num2 = sc.nextInt();
        sc.close();

        SomaEhMaiorQue100(num1, num2);


    }
    public static boolean SomaEhMaiorQue100(int num1, int num2){
        if ((num1 + num2) > 100){
            System.out.println("Eh maior que 100");
        } else {
            System.out.println("Não é maior que 100");
        }
        return num1 + num2 > 100;
    }
}
