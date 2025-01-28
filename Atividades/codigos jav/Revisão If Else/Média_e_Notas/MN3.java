package Média_e_Notas;

import java.util.Scanner;

public class MN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a 1 nota");
        float nota1 = sc.nextFloat();

        System.out.println("Escreva a 2 nota");
        float nota2 = sc.nextFloat();

        System.out.println("Escreva a 3 nota");
        float nota3 = sc.nextFloat();

        if (nota1 > nota2 && nota2 > nota3){
            System.out.println("maior nota é " + nota1);
        } else if (nota2 > nota1 && nota1 > nota3){
            System.out.println("maior nota é " + nota2);
        } else {
            System.out.println("maior nota é " + nota3);
        }

        if (nota1 < nota2 && nota2 < nota3){
            System.out.println("maior nota é " + nota1);
        } else if (nota2 < nota1 && nota1 < nota3){
            System.out.println("maior nota é " + nota2);
        } else {
            System.out.println("maior nota é " + nota3);
        }
        sc.close();
    }
}
