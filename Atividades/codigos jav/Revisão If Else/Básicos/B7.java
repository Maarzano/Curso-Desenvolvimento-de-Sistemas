package Básicos;

import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        if(num % 5 == 0){
            System.out.println("Seu número " + num + " é divisível por 5");
        } else {
            System.out.println("Seu número " + num + " não é divisível por 5");
        }


        sc.close();
    }
}
