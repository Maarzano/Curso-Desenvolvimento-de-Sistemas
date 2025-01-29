package Desafios_e_Jogos;
import java.util.Scanner;

public class DJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o 1º número: ");
        int num1 = sc.nextInt();
        System.out.print("\nInforme o 2º número: ");
        int num2 = sc.nextInt();
        System.out.print("\nInforme o 3º número: ");
        int num3 = sc.nextInt();

        if (num1 < num2 && num2 < num3){
            System.out.println("\n" + num1 + ", "+ num2 + ", "+ num3);
        } else if (num1 < num2 && num2 > num3){
            System.out.println("\n" + num1 + ", "+ num3 + ", "+ num2);
        } else if (num1 >num2 && num1 < num3) {
            System.out.println("\n" + num2 + ", "+ num1 + ", "+ num3);
        } else if (num1 > num2 && num1 > num3 && num3 > num2) {
            System.out.println("\n" + num2 + ", "+ num3 + ", "+ num1);
        } else if (num3 < num1 && num1 > num2) {
            System.out.println("\n" + num3 + ", "+ num2 + ", "+ num1);
        } else {
            System.out.println("\n" + num3 + ", "+ num1 + ", "+ num2);
        }
        sc.close();
    }
}