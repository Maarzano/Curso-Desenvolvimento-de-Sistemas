// Receba três notas e determine a maior e a menor nota.
package Métodos5Escolhidos;

import java.util.Scanner;

public class Att3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva sua 1° nota");
        double nota1 = sc.nextDouble();

        System.out.println("Escreva sua 2° nota");
        double nota2 = sc.nextDouble();

        System.out.println("Escreva sua 3° nota");
        double nota3 = sc.nextDouble();

        maiorMenor(nota1, nota2, nota3);

    }















    public static double maiorNota(double num1, double num2, double num3){
        double result;
        if(num1 > num2 && num2 > num3){
            result = num1;
        } else if (num2 > num1 && num1 > num3){
            result  = num2;
        } else result = num3;
        return  result;
    }
    public static double menorNota(double num1, double num2, double num3){
        double result;
        if(num1 < num2 && num2 < num3){
            result = num1;
        } else if (num2 < num1 && num1 < num3){
            result  = num2;
        } else result = num3;
        return  result;
    }

    public static void  maiorMenor(double num1, double num2, double num3){
        System.out.println("Menor nota: " + menorNota(num1, num2, num3));
        System.out.println("Maior nota: " + maiorNota(num1, num2, num3));
    }
}
