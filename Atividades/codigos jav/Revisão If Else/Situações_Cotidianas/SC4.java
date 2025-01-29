package Situações_Cotidianas;

import java.util.Scanner;

public class SC4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("escreva a idade da pessoa");
        int idade = sc.nextInt();

        System.out.println("escreva o peso da pessoa");
        double peso = sc.nextDouble();
        sc.nextLine();

        if (idade > 18 && idade < 65 && peso >= 50){
            System.out.println("pode soar sangue");
        }else {
            System.out.println("não pode doar samgue");
        }
        sc.close();
    }
}
