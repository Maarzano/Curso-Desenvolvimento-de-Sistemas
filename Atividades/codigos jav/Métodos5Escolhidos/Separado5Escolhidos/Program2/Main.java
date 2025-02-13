package Métodos5Escolhidos.Separado5Escolhidos.Program2;
import Métodos5Escolhidos.Separado5Escolhidos.Program2.Models.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Verificador ver = new Verificador();

        System.out.println("Escreva uma palavra");
        String palavra = sc.nextLine();

        System.out.println(ver.ComecaCom(palavra, "a"));
    }
}
