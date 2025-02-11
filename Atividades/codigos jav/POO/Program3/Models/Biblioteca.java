package Program3.Models;

import java.util.*;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca(){
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void listarLivrosDisponiveis(){
        System.out.print("Livros disponíveis: ");
        for (var recebe : livros){
            if(recebe.isDisponivel()){
                System.out.print(recebe.getTitulo() + ", ");
            }
        }
        System.out.println();
    }

    public void emprestarLivro(Usuario usuario, Livro livro){
        if(livro.isDisponivel()){
            livro.emprestar();
            usuario.receberLivro(livro);
            System.out.println(usuario.getNome() + " pegou o livro " + livro.getTitulo() + " emprestado da biblioteca");
        } else {
            System.out.println("Livro indisponível para empréstimo da biblioteca");
        }
    }

    public void receberDevoluçãoLivro(Usuario usuario, Livro livro){
        if (usuario.possuiLivro(livro)){
            livro.devolver();
            usuario.removerLivroEmprestado(livro);
            System.out.println(usuario.getNome() + " devolveu o livro " + livro.getTitulo());
        } else {
            System.out.println("Este livro não foi emprestado por " + usuario.getNome());
        }
    }

}
