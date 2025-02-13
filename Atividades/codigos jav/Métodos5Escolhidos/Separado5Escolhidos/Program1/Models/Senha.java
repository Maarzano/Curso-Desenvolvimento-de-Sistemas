package Métodos5Escolhidos.Separado5Escolhidos.Program1.Models;

public class Senha {

    public String VerificarSenha(String senha){
        return (senha.equals("123artes")) ? "Acertou a senha" : "Errou a senha";
    }
}
