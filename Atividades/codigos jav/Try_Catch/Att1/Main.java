package Att1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = 0, numero2 = 0;
        double result = 0;

        System.out.print("Digite dois números. \n1: ");
        String num1 = sc.nextLine();
        System.out.print("2: ");
        String num2 = sc.nextLine();

        try{
            numero1 = Integer.parseInt(num1);
            numero2 = Integer.parseInt(num2);
        } catch (NumberFormatException ex){
            System.out.println(ex + " você não digitou um número válido em uma das vezes.");
        }
        try{
            result = numero1 / numero2;
        }catch (ArithmeticException ex){
            System.out.println(ex + " você não pode dividir por 0");
        }
        System.out.println(numero1 + " divido por " + numero2 + " é " + result);


    }
}
