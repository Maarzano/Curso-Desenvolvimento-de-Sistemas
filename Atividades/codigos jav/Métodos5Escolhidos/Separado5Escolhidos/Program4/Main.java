package Métodos5Escolhidos.Separado5Escolhidos.Program4;

import Métodos5Escolhidos.Separado5Escolhidos.Program4.Models.Verificador;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);
        Verificador ver = new Verificador();

        int numeroAleatorio = gerador.nextInt(1, 10);
        int numeroCutado;


        System.out.println("Chute um número inteiro");
        do{
            numeroCutado = sc.nextInt();
            System.out.println((ver.acertouNumero(numeroCutado, numeroAleatorio)) ? "Acertou" : "Errou tente de novo");
        }while (numeroCutado != numeroAleatorio);

    }
}
