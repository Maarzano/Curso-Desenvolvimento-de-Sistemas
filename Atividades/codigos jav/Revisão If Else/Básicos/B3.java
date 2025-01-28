package Básicos;

import java.util.*;
public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("escreva seu 1 número");
        int num1 = sc.nextInt();

        System.out.println("agora o 2");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("o maior número é: " + num1);
        } else if (num1 < num2){
            System.out.println("o maior número é: " + num2);
        } else {
            System.out.println("os número são iguais");
        }
        sc.close();
    }
}
