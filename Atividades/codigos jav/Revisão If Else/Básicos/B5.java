package Básicos;

import java.util.*;
public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ecreva seu 1 número:");
        int num1 = sc.nextInt();

        System.out.println("ecreva seu 2 número:");
        int num2 = sc.nextInt();

        System.out.println("ecreva seu 3 número:");
        int num3 = sc.nextInt();

        if (num1 > num2 && num2 > num3){
            System.out.println("Maior número é: " + num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("Maior número é: " + num2);
        } else{
            System.out.println("Maior número é: " + num3);
        }
        sc.close();
    }
}
