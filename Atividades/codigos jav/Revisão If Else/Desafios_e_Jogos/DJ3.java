package Desafios_e_Jogos;
import java.util.Scanner;

public class DJ3 {
    public static void main(String[] args) {
        int numsecret = 15973;
        int tent;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nAdivinhe o número secreto: ");
            tent = sc.nextInt();
            if (tent != numsecret){
                System.out.println("\nTente Novamente\n");
            }
        }while(tent != numsecret);

        System.out.println("\nParabéns, você adivinhou o número secreto!");
        sc.close();
    }
}