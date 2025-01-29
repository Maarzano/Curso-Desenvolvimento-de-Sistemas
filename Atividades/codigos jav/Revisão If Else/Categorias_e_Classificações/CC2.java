package Categorias_e_Classificações;

import java.util.Scanner;


public class CC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe sua faixa de classificação (1 a 30): ");
        int clas = sc.nextInt();


        if (clas >= 1 && clas <=10) {
            System.out.println("\nFaixa de classificação: A");
        } else if (clas >10 && clas <=20) {
            System.out.println("\nFaixa de classificação: B");
        } else if (clas > 20 && clas <=30) {
            System.out.println("\nFaixa de classificação: C");
        } else {
            System.out.println("\nNúmero inválido!");
        }
        sc.close();
    }
}
