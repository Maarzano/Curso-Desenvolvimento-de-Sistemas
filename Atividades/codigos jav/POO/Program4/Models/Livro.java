package Program4.Models;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }


    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean verdadeFalso){
        disponivel = verdadeFalso;
    }
    
    @Override
    public String toString(){
        return "Título: " + this.titulo + ", autor: " + this.autor + ", Disponível: " + ((disponivel) ? "Sim" : "Não");
    }
}
