package Básicos;

import java.util.*;
public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um ano: ");
        int ano = sc.nextInt();

        if (ano % 4 != 0 && ano % 400 != 0){
            System.out.println("Não é bissexto");
        } else {
            System.out.println("É bissexto");
        }
    }
}
