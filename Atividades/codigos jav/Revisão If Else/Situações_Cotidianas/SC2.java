package Situações_Cotidianas;

import java.util.Scanner;

public class SC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha de acesso: ");
        int  senha = sc.nextInt();

        int senhaReal = 1234;

        if (senha == senhaReal){
            System.out.println("Acesso confirmado");
        } else{
            System.out.println("Acesso negado");
        }
        sc.close();
    }
}
