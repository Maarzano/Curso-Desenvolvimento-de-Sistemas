/*Objetivo: Criar um sistema simples para controle de estoque de produtos.

Requisitos:

Criar uma classe Produto com atributos como código, nome, preço, e quantidade em estoque.
Criar métodos para adicionar e remover produtos do estoque.
Criar uma classe Estoque para gerenciar os produtos (usando uma lista de objetos Produto).*/

package Program1;

import Program1.Models.*;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Camiseta", 39.99, 100);
        Produto produto2 = new Produto("Calça Jeans", 99.90, 50);
        Produto produto3 = new Produto("Tênis Esportivo", 179.90, 30);

        Estoque estoque = new Estoque();

        estoque.adicionarProdutoAoEstoque(produto1);
        estoque.adicionarProdutoAoEstoque(produto2);
        estoque.adicionarProdutoAoEstoque(produto3);

        System.out.println("Estoque após adição:");
        estoque.exibirEstoque();

        estoque.removerProdutoDoEstoque(2);
        estoque.removerProdutoDoEstoque(5);

        System.out.println("\nEstoque após remoção:");
        estoque.exibirEstoque();
    }
}
