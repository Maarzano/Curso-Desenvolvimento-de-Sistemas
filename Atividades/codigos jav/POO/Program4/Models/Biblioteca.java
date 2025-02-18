package Program4.Models;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca(){
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }


    public void registrarUsuario(Usuario user){
        usuarios.add(user);
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void consultarLivrosDisponíveis(){
        System.out.println("\n📚 Livros Disponíveis:");
        for (Livro livro : livros){
            if (livro.isDisponivel()){
                System.out.println(livro);
            }
        }
    }

    public void consultarLivrosEmprestados(){
        System.out.println("\n📚 Livros Emprestados:");
        for (Livro livro : livros){
            if (!livro.isDisponivel()){
                System.out.println(livro);
            }
        }
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

}
