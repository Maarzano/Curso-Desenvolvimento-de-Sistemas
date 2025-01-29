package Operações_Matemáticas;

import java.util.*;
public class OM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva um número: ");
        int num = sc.nextInt();

        System.out.println("escreva outro número: ");
        int num2 = sc.nextInt();

        if(num + num2 > 100){
            System.out.println("A soma dos números é maior que 100");
        } else {
            System.out.println("A soma dos números é menor que 100 ou igual");
        }
        sc.close();
    }
}
