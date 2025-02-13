import java.util.Scanner;

import Models.Verificante;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Verificante verificante = new Verificante();


        System.out.print("Escreva seu 1° número: ");
        int num1 = sc.nextInt();

        System.out.print("Escreva seu 2° número: ");
        int num2 = sc.nextInt();

        System.out.print("Escreva seu 3° número: ");
        int num3 = sc.nextInt();
        sc.close();

        System.out.println("O maior número digiteado foi " + verificante.maiorNumero(num1, num2, num3));
        
    }
}
