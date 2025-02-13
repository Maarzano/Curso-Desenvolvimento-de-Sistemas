package Métodos5Escolhidos;

import java.util.Scanner;

public class Att1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();
        System.out.println(VerificarSenha(senha));
        sc.close();

    }
    public static boolean VerificarSenha(String senha){
        boolean acertou = false;
        if (senha.equals("1223werg")) acertou = true;
        return acertou;
    }
}
