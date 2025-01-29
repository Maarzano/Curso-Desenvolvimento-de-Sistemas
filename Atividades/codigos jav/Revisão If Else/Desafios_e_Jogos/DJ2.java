package Desafios_e_Jogos;
import java.util.Scanner;

public class DJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num1 = sc.nextInt();
        System.out.print("\nInforme outro número: ");
        int num2 = sc.nextInt();

        if (num1 > (num2 * 2)){
            System.out.println("\n" + num1 + " é maior que o dobro de " + num2);
        } else {
            System.out.println("\n" + num1 + " é não é maior que o dobro de " + num2);
        }
        sc.close();
    }
}