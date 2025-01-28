package Média_e_Notas;

import java.util.Scanner;

public class MN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a 1 nota");
        float nota1 = sc.nextFloat();

        System.out.println("Escreva a 2 nota");
        float nota2 = sc.nextFloat();

        if((nota1 + nota2) / 2 >= 7){
            System.out.println("Você foi aprovado");
        } else{
            System.out.println("Reprovado");
        }
        sc.close();
    }
}
