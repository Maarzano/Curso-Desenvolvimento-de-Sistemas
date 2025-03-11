package Exercício3;

import Exercício3.Models.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camisa", 100);
        Produto produto2 = new Produto("short", 100, 12);

        System.out.println(produto1 + " " + produto2);

        produto1.AdicionarEstoque(3);
        System.out.println(produto1 + " " + produto2);

        produto1.RemoverEstoque(4);
        System.out.println(produto1 + " " + produto2);

        produto2.RemoverEstoque(5);
        
        produto1.getNome();
        produto2.getNome();
        
    }
}
