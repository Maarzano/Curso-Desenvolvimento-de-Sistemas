package Básicos;

import java.util.*;
public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Escreva um número inteiro:");

        int num = sc.nextInt();

        if(num >= 0){
            System.out.println("é positivo");
        } else{
            System.out.println("negativo!");
        }
    }
}
