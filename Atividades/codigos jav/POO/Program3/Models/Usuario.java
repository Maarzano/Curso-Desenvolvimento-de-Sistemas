package Program3.Models;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
        livrosEmprestados = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public void receberLivro(Livro livro){
        livrosEmprestados.add(livro);
    }

    public void removerLivroEmprestado(Livro livro) {
        livrosEmprestados.remove(livro);
        Biblioteca biblioteca = new Biblioteca();
    }

    public boolean possuiLivro(Livro livro){
        return livrosEmprestados.contains(livro);
    }

    public void emprestarLivroColega(Usuario usuario, Livro livro){
        if(possuiLivro(livro)){
            removerLivroEmprestado(livro);
            usuario.receberLivro(livro);
            System.out.println(getNome() + " emprestou o livro " + livro.getTitulo() + " para " + usuario.getNome());
        } else{
            System.out.println(getNome() + " não possui o livro " + livro.getTitulo());
        }
    }

    public void listarLivrosEmprestados(){
        System.out.print("Livros emprestados por " + nome + ": ");
        for(var recebe : livrosEmprestados){
            System.out.print(recebe.getTitulo() + ", ");
        }
        System.out.println();
    }

}
