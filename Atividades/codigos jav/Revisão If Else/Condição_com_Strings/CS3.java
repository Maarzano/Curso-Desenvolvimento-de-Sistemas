package Condição_com_Strings;
import java.util.*;

public class CS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um nome: ");
        String nome = sc.nextLine().toLowerCase();

        if (nome.charAt(0) == 'a'){
            System.out.println("o nome comeca com a");
        } else {
            System.out.println("o nome nao comeca com a");
        }
        sc.close();
    }
}
