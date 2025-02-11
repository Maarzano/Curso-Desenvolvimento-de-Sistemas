package Program1.Models;

public class Pessoa {
    public Pessoa(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }
    public Pessoa(){

    }
    public String nome;
    public int idade;

    public void Apresentar(){
        System.out.println("Olá " + nome + " você tem " + idade + " de idade");
    }
}
