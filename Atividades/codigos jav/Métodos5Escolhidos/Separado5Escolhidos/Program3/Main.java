package Métodos5Escolhidos.Separado5Escolhidos.Program3;

import Métodos5Escolhidos.Separado5Escolhidos.Program3.Models.Calculador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculador  calculador = new Calculador();

        System.out.println("Escreva sua 1° nota");
        double nota1 = sc.nextDouble();

        System.out.println("Escreva sua 2° nota");
        double nota2 = sc.nextDouble();

        System.out.println("Escreva sua 3° nota");
        double nota3 = sc.nextDouble();

        calculador.maiorMenor(nota1, nota2, nota3);

    }
}
