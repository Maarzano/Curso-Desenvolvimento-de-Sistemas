package Categorias_e_Classificações;

import java.util.Scanner;


public class CC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();


        if (idade <=13) {
            System.out.println("Você é uma criança");
        } else if (idade < 20) {
            System.out.println("Você é um adolescente");
        } else if (idade <65) {
            System.out.println("Você é um adulto");
        } else {
            System.out.println("Você é um idoso");
        }
        sc.close();
    }
}