package Básicos;

import java.util.*;
public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Escreva um número inteiro:");

        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("é par");
        } else{
            System.out.println("ímpar!");
        }
    }
}
