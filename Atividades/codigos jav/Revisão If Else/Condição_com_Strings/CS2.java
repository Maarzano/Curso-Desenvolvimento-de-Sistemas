package Condição_com_Strings;
import java.util.*;

public class CS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();

        if (senha == 1234){
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
        sc.close();
    }
}
