package Média_e_Notas;

import java.util.Scanner;

public class MN5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("escreva sua primeira nota de uma disciplina");
        float nota1Disciplina1 = sc.nextFloat();

        System.out.println("escreva sua segunda nota de uma disciplina");
        float nota2Disciplina1 = sc.nextFloat();

        System.out.println("escreva sua 1° nota da 2° disciplina");
        float nota1Disciplina2 = sc.nextFloat();

        System.out.println("escreva sua 2° nota da 2° disciplina");
        float nota2Disciplina2 = sc.nextFloat();

        float mediaDisciplina1 = (nota1Disciplina1 + nota2Disciplina1) / 2;
        float mediaDisciplina2 = (nota1Disciplina2 + nota2Disciplina2) / 2;

        if (mediaDisciplina1 >= 7 && mediaDisciplina2 >= 7) {
            System.out.println("aprovado nas duas disciplinas");
        } else {
            System.out.println("reprovado em uma ou nas duas disciplinas");
        }
        sc.close();
    }
}
