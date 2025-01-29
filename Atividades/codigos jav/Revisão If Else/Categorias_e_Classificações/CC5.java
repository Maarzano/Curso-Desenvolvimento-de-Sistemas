package Categorias_e_Classificações;

import java.util.Scanner;

public class CC5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a temperatura em Cº");
        int temp = sc.nextInt();

        if (temp < 15) {
            System.out.println("\nEstá frio");
        } else if (temp < 25) {
            System.out.println("\nEstá agradável");
        } else {
            System.out.println("\nEstá calor");
        }
        sc.close();
    }
}