package Exercício3.Models;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;

        if (preco > 0){
            this.preco = preco;
        } else throw new RuntimeException( "Não pode ter preço negativo");
        
        this.estoque = estoque;
    }
    public Produto(String nome, double preco){
        this(nome, preco, 1);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void AdicionarEstoque(int quantidade){
        this.estoque += estoque;
    }
    public void RemoverEstoque(int quantidade){
        if (estoque > 0 && estoque >= quantidade){
            this.estoque -= estoque;
        } else throw new RuntimeException("Não pode retirar essa quantidade");
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + "\n" +
                "Preço: " + this.preco + "\n" + 
                "Estoque: " + this.estoque + "\n";
    }

}
