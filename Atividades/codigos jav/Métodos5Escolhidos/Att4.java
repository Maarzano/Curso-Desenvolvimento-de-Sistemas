// Determine se o usuário acertou um número entre 1 e 10 sorteado pelo
//programa.
package Métodos5Escolhidos;

import java.util.Random;
import java.util.Scanner;

public class Att4 {
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = gerador.nextInt(10) + 1;

        System.out.println("Chute um número inteiro");
        int chute;

        do {
            chute = sc.nextInt();
        } while (!acertouNumero(chute, numeroAleatorio));
    }

    public static boolean acertouNumero(int chute, int num){
        boolean resposta = false;
        if(chute == num){
            System.out.println("Acertou número");
            resposta = true;
        } else {
            System.out.println("Errou");
        }
        return resposta;


    }

}
