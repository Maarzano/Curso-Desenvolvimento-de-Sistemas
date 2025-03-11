package Exercício4.Models;

public class Produto {

    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;

        if (preco < 0) {
            this.preco = 0.0;
        } else {
            this.preco = preco;
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}
