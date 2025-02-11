/* Sistema de Biblioteca

Objetivo: Criar um sistema simples de gerenciamento de livros em uma biblioteca.
Classes:
Livro (com atributos como título, autor, ano, status de disponibilidade)
Usuario (nome, email, lista de livros emprestados)
Biblioteca (gerencia os livros, usuários e empréstimos)
Operações:
Emprestar e devolver livros
Exibir lista de livros disponíveis
Mostrar livros emprestados por um usuário */

package Program3;

import Program3.Models.Biblioteca;
import Program3.Models.Livro;
import Program3.Models.Usuario;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Senhor dos Aneis", "J.R.R> Tolkien", 1954);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
    
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        Usuario usuario1 = new Usuario("Patrícia", "Patricia12@gmail.com");
        biblioteca.adicionarUsuario(usuario1);

        Usuario usuario2 = new Usuario("Arthur", "Arthuramarzano10@gmail.com");
        biblioteca.adicionarUsuario(usuario2);

        biblioteca.listarLivrosDisponiveis();

        biblioteca.emprestarLivro(usuario1, livro1);
        biblioteca.listarLivrosDisponiveis();

        usuario1.listarLivrosEmprestados();
        usuario2.listarLivrosEmprestados();

        usuario1.emprestarLivroColega(usuario2, livro1);

        usuario1.listarLivrosEmprestados();
        usuario2.listarLivrosEmprestados();

        biblioteca.receberDevoluçãoLivro(usuario2, livro1);

        usuario1.listarLivrosEmprestados();
        usuario2.listarLivrosEmprestados();

        biblioteca.listarLivrosDisponiveis();
        
    }
}
