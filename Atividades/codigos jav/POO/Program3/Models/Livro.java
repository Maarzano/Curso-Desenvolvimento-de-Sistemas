package Program3.Models;

public class Livro {
    private String titulo;
    private String autor;
    private int anoLançamento;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int anoLançamento){
        this.titulo = titulo;
        this.autor = autor;
        this.anoLançamento = anoLançamento;
        this.disponibilidade = true;
    }
    public String getTitulo(){
        return titulo;
    }
    public boolean isDisponivel(){
        return disponibilidade;
    }
    public void emprestar(){
        this.disponibilidade = false;
    }
    public void devolver(){
        this.disponibilidade = true;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + " | Autor: " + autor + " | Ano: " + anoLançamento + " | Disponível: " + (disponibilidade ? "Sim" : "Não");
    }

}
