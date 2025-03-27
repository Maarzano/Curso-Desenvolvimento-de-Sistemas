package Att4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva dois números. \n1: ");
        int num1 = 0, num2 = 0;

        try{
            num1 = sc.nextInt();
        } catch (Exception ex){
            System.out.println(ex + " Não inseriu um número!");
        }
        System.out.print("2: ");
        try{
            num2 = sc.nextInt();
        } catch (Exception ex){
            System.out.println(ex + " Não inseriu um número!");
        }
        System.out.println(num1 + num2);
    }
}
