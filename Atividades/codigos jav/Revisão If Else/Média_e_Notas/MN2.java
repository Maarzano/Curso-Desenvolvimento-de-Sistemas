package Média_e_Notas;

import java.util.Scanner;

public class MN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a 1 nota");
        float nota1 = sc.nextFloat();

        System.out.println("Escreva a 2 nota");
        float nota2 = sc.nextFloat();

        float media = (nota1 + nota2) / 2;

        if(media >= 7){
            System.out.println("Você foi aprovado");
        } else if (media >= 5){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}
