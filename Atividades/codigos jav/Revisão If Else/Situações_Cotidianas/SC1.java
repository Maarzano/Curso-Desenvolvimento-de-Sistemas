package Situações_Cotidianas;

import java.util.Scanner;

public class SC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a placa de um veículo");
        String placa = sc.nextLine();

        char guarda = placa.charAt(placa.length() - 1);

        int finalPlaca = guarda;

        if(finalPlaca % 2 == 0){
            System.out.println("Terminada em par");
        } else {
            System.out.println("terminada em ímpar");
        }

        sc.close();
    }
}
