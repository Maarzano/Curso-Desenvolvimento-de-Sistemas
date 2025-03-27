package Att3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean deu = true;
        System.out.print("digite um número: ");
        int numero = sc.nextInt();

        try{
            var result = Math.sqrt(numero); // isso não gera uma exceção, pelo menos não está gerando
        }catch(Exception ex){
            deu = false;
            System.out.println(ex + " não pode negativo");
        } finally {
            sc.close();
        }
        System.out.println((deu) ? "deu " + Math.sqrt(numero) : "num deu" );
    }
}
