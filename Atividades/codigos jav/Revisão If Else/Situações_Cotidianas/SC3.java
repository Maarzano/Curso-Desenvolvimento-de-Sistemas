package Situações_Cotidianas;

import java.util.Scanner;

public class SC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um temperatura em °C ");
        Double Temp = sc.nextDouble();
        sc.nextLine();

        System.out.println("Deseja converter para Kelvin?");
        String repsota = sc.nextLine();

        if(repsota.equalsIgnoreCase("sim")){

            System.out.println("em kelvin fica: " + (Temp + 273.15));

        } else {
            System.out.printf("Ok tchau!");
        }
    }
}
