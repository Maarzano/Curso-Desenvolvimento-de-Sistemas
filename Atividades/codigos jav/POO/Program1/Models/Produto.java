package Program1.Models;

public class Produto {
    private int id;
    private static int contadorId = 0;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.id += ++contadorId;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | nome: " + this.nome + " | preço: " + preco + " | quantidade em estoque: " + quantidade;
    }
}
