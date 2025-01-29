package Categorias_e_Classificações;

import java.util.Scanner;

public class CC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe sua altura em cm: ");
        int h = sc.nextInt();


        if (h < 170) {
            System.out.println("\nVocê é baixo");
        } else if (h < 180) {
            System.out.println("\nVocê é mediano");
        } else {
            System.out.println("\nVocê é alto");
        }
        sc.close();
    }
}