package Condição_com_Strings;
import java.util.*;
public class CS4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite uma palavra:");
        String palavra = sc.nextLine().toLowerCase();

        palavra = palavra.replace(" ", "");

        if(palavra.length() >= 5){
            System.out.println("contem 5 ou mais letras");
        } else {
            System.out.println("contem menos que 5 letras");
        }
        sc.close();
    }
}
