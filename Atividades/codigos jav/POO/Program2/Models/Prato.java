package Program2.Models;

public class Prato {

    private int id;
    private String nome;
    private double preco;

    public Prato(int id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }

    @Override
    public String toString() {
        return id + " - " + nome + " (R$ " + preco + ")";
        
    }
}

