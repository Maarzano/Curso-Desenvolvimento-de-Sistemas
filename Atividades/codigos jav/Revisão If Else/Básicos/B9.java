package Básicos;

import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um número inteiro");
        int num = sc.nextInt();

        if(num > 50 || num < 10){
            System.out.println("Está fora do intervalo (10 a 50)");
        } else {
            System.out.println("está dentro do intervalo (10 a 50)");
        }
    }
}
