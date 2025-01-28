package Básicos;

import java.util.*;
public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        if(idade >= 16){
            System.out.println("você pode votar");
        } else {
            System.out.println("Você não pode votar");
        }
    }
}
