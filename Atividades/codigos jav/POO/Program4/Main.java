/*
A atividade pede para você criar um **sistema de gerenciamento de biblioteca** em Java, utilizando **Programação Orientada a Objetos (POO)**. O sistema deve permitir cadastrar livros, emprestar livros para usuários, devolver livros e consultar os livros disponíveis ou emprestados. Aqui estão os principais pontos:

1. **Classes**: Crie as classes `Livro`, `Usuario`, `Biblioteca` e `Emprestimo`.
2. **Herança**: A classe `LivroInfantil` deve herdar de `Livro` e ter um comportamento específico.
3. **Polimorfismo**: Crie métodos sobrecarregados, por exemplo, para empréstimo de livros infantis com base na faixa etária.
4. **Interfaces**: Implemente uma interface `Empréstimo` na classe `Emprestimo`.
5. **Exceções**: Crie exceções personalizadas para situações como livro indisponível ou faixa etária inválida.

Esse sistema deve gerenciar livros e usuários, fazendo uso dos conceitos de **encapsulamento**, **herança**, **polimorfismo**, **interfaces** e **exceções**.
*/
package Program4;

import Program4.Models.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Emprestimo emprestimo = new Emprestimo();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Registrar Usuário");
            System.out.println("2. Adicionar Livro");
            System.out.println("3. Consultar Livros Disponíveis");
            System.out.println("4. Consultar Livros Emprestados");
            System.out.println("5. Realizar Empréstimo");
            System.out.println("6. Devolver Livro");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do usuário: ");
                    String nomeUsuario = scanner.nextLine();
                    System.out.print("Idade do usuário: ");
                    int idadeUsuario = scanner.nextInt();
                    scanner.nextLine();
                    Usuario usuario = new Usuario(nomeUsuario, idadeUsuario);
                    biblioteca.registrarUsuario(usuario);
                    System.out.println("Usuário registrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Título do livro: ");
                    String tituloLivro = scanner.nextLine();
                    System.out.print("Autor do livro: ");
                    String autorLivro = scanner.nextLine();
                    System.out.print("É um livro infantil? (s/n): ");
                    String isInfantil = scanner.nextLine();
                    if (isInfantil.equalsIgnoreCase("s")) {
                        System.out.print("Faixa etária recomendada: ");
                        int faixaEtaria = scanner.nextInt();
                        scanner.nextLine();
                        LivroInfantil livroInfantil = new LivroInfantil(tituloLivro, autorLivro, faixaEtaria);
                        biblioteca.adicionarLivro(livroInfantil);
                    } else {
                        Livro livro = new Livro(tituloLivro, autorLivro);
                        biblioteca.adicionarLivro(livro);
                    }
                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 3:
                    biblioteca.consultarLivrosDisponíveis();
                    break;

                case 4:
                    biblioteca.consultarLivrosEmprestados();
                    break;

                case 5:
                    System.out.print("Nome do usuário: ");
                    String nomeEmprestimo = scanner.nextLine();
                    System.out.print("Título do livro: ");
                    String tituloEmprestimo = scanner.nextLine();
                    Usuario userEmprestimo = biblioteca.getUsuarios().stream()
                            .filter(u -> u.getNome().equals(nomeEmprestimo))
                            .findFirst()
                            .orElse(null);
                    Livro livroEmprestimo = biblioteca.getLivros().stream()
                            .filter(l -> l.getTitulo().equals(tituloEmprestimo))
                            .findFirst()
                            .orElse(null);
                    if (userEmprestimo != null && livroEmprestimo != null) {
                        try {
                            if (livroEmprestimo instanceof LivroInfantil) {
                                emprestimo.realizarEmprestimo((LivroInfantil) livroEmprestimo, userEmprestimo);
                            } else {
                                emprestimo.realizarEmprestimo(livroEmprestimo, userEmprestimo);
                            }
                        } catch (LivroIndisponivelException | FaixaEtariaInvalidaException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Usuário ou livro não encontrado.");
                    }
                    break;

                case 6:
                    System.out.print("Título do livro a ser devolvido: ");
                    String tituloDevolucao = scanner.nextLine();
                    Livro livroDevolucao = biblioteca.getLivros().stream()
                            .filter(l -> l.getTitulo().equals(tituloDevolucao))
                            .findFirst()
                            .orElse(null);
                    if (livroDevolucao != null) {
                        emprestimo.devolverLivro(livroDevolucao);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 7:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}