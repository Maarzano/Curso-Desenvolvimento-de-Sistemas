package Métodos5Escolhidos.Separado5Escolhidos.Program5;

import Métodos5Escolhidos.Separado5Escolhidos.Program5.Models.SomaMaior;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SomaMaior veri = new SomaMaior();

        System.out.print("Escreva o 1° número: ");
        int num1 = sc.nextInt();

        System.out.print("Escreva o 2° número: ");
        int num2 = sc.nextInt();
        sc.close();

        System.out.println((veri.SomaMaiorQue100(num1, num2)) ? "Maior que 100!!" : "Menor ou igual a 100");

    }
}
