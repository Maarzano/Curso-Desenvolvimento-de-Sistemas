package Program4.Models;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private int idade;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        livrosEmprestados = new ArrayList<>();
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public List<Livro> getLivrosEmprestados(){
        return livrosEmprestados;
    }
    public void emprestarLivro(Livro livro){
        livrosEmprestados.add(livro);
    }
    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }
}
