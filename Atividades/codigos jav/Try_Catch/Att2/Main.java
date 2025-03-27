package Att2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean numcorreto = true;
        System.out.print("Escreva um número: ");
        String numero = sc.nextLine();

        try{
            int numeroInt = Integer.parseInt(numero);
        } catch (NumberFormatException ex){
            numcorreto = false;
            System.out.println(ex + "número incorreto");
        } finally {
            sc.close();
        }
            System.out.println("Seu número é " + ((numcorreto) ? " válido" : " ínvalido"));
    }
}
