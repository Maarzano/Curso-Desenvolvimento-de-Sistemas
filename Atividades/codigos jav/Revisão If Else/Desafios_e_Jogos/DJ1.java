package Desafios_e_Jogos;
import java.util.Scanner;

public class DJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o 1º número: ");
        int num1 = sc.nextInt();
        System.out.print("\nInforme o 2º número: ");
        int num2 = sc.nextInt();

        if (num1 > 0 && num2 > 0){
            System.out.println("\nAmbos os números são positivos");
        } else if (num1 < 0 &&  num2 < 0) {
            System.out.println("\nAmbos os números são negativos");
        } else {
            System.out.println("\nOs números possuem sianis diferentes");
        }
        sc.close();
    }
}