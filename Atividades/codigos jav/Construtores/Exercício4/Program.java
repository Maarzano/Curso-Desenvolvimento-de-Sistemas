package Exercício4;

import Exercício4.Models.Produto;

public class Program {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto A", 120.50);

        Produto produto2 = new Produto("Produto B", -50.0);

        System.out.println("Informações do Produto 1:");
        produto1.exibirInformacoes();

        System.out.println("\nInformações do Produto 2:");
        produto2.exibirInformacoes();
    }
}
