package Program4.Models;

public class LivroInfantil extends Livro{
    private int faixaEtaria;
    
    public LivroInfantil(String titulo, String autor, int faixaEtáriaRecomendada) {
        super(titulo, autor);
        this.faixaEtaria = faixaEtáriaRecomendada;
    }

    public int getFaixaEtaria(){
        return faixaEtaria;
    }

    @Override
    public String toString() {
        return super.toString() + ", Faixa Etária Recomendada: " + faixaEtaria + " anos";
    }
}
