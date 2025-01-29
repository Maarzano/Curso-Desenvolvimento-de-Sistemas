package Decisões_Financeiras;
import java.util.Scanner;


public class DF3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe ser salário: ");
        float sal = sc.nextFloat();


        if (sal >= 3000.00){
            System.out.println("\nVocê pode financiar um imóvel");
        } else {
            System.out.println("Você não pode financiar um imóvel");
        }
        sc.close();
    }
}