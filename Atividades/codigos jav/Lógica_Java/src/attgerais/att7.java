package attgerais;

import java.util.Scanner;

public class att7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Escreva o 1° número: ");
            int num = sc.nextInt();
            System.out.println("Escreva o 2° número: ");
            int num2 = sc.nextInt();

            System.out.println(Dividir(num, num2));

        } catch (Exception e) {
            System.out.println("DEU B.O");
        }
    }

    public static double Dividir(int num, int num2){
        return num / num2;
    }
}
