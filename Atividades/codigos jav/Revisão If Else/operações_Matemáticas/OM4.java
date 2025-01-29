package Operações_Matemáticas;
//Receba três números e verifique se eles podem formar um triângulo.
import java.util.Scanner;

public class OM4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        if (num1 + num2 > num3 && num1 + num3 > num2 && num2 + num3 > num1) {
            System.out.println("Os números podem formar um triângulo");
        } else {
            System.out.println("Os números não podem formar um triângulo");
        }
        sc.close();
    }

}
