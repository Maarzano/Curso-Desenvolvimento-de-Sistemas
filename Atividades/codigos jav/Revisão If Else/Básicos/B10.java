package Básicos;

import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um número inteiro");
        int num = sc.nextInt();

        if(num < 100 || num > 200){
            System.out.println("Fora do intervalo de (100 a 200)");
        } else{
            System.out.println("dentro do intervalo de (100 a 200)");
        }
        sc.close();
    }
}
