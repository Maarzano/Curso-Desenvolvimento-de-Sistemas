package Condição_com_Strings;

import java.util.Scanner;

public class CS5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a 1° palavra: ");
        String palavra1 = sc.nextLine().toLowerCase();

        System.out.println("Digite a 2° palavra: ");
        String palavra2 = sc.nextLine().toLowerCase();

        if (palavra1.equals(palavra2)){
            System.out.println("As palavras sao iguais");
        } else {
            System.out.println("As palavras sao diferentes");
        }
        sc.close();
    }
}