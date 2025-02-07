// Verifique se um nome digitado começa com a letra "A";
package Métodos5Escolhidos;

import java.util.Scanner;

public class Att2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva uma palavra");
        String palavra = sc.nextLine();

        VerificarComecaA(palavra);

    }

    public static void VerificarComecaA(String palavra) {
        if (String.valueOf(palavra.charAt(0)).equalsIgnoreCase("a")){
            System.out.println("Começa com a");
        } else {
            System.out.println("não começa com a");
        }


    }
}
