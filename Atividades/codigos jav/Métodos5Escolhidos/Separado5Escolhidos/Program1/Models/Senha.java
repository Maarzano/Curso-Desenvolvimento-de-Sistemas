package Métodos5Escolhidos.Separado5Escolhidos.Program1.Models;

public class Senha {
    private String senha;

    public String VerificarSenha(String senha){
        this.senha = senha;
        return (senha.equals("123artes")) ? "Acertou a senha" : "Errou a senha";
    }
}
