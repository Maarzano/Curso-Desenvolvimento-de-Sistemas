package Métodos5Escolhidos.Separado5Escolhidos.Program1;

import Métodos5Escolhidos.Separado5Escolhidos.Program1.Models.Senha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Senha senha = new Senha();

        System.out.print("Digite a senha: ");
        String snha = sc.nextLine();

        System.out.println(senha.VerificarSenha(snha));

    }
}
