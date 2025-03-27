package Att3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean deu = true;
        System.out.print("digite um número: ");
        int numero = sc.nextInt();

        try{
            if (numero < 0){
                throw new IllegalArgumentException("não pode ser número negativo");
            }

            var result = Math.sqrt(numero); // isso não gera uma exceção, tive que jogar uma.
        }catch(IllegalArgumentException ex){
            deu = false;
            System.out.println(ex);
        } finally {
            sc.close();
        }
        System.out.println((deu) ? "deu " + Math.sqrt(numero) : "num deu" );
    }
}
