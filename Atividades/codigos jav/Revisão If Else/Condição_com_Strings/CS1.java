package Condição_com_Strings;
import java.util.*;

public class CS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite uma palavra:");
        String palavra = sc.nextLine().toLowerCase();

        if (palavra.equals("sim")){
            System.out.println("voce digitou sim");
        } else if (palavra.equals("nao")){
            System.out.println("voce digitou nao");
        } else {
            System.out.println("voce digitou algo diferente de sim e nao");
        }
        sc.close();
    }
}
