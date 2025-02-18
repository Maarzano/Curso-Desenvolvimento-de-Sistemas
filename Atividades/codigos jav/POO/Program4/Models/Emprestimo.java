package Program4.Models;

public class Emprestimo {

    public void realizarEmprestimo(Livro livro, Usuario user){
        if (!livro.isDisponivel()) {
            throw new LivroIndisponivelException("Livro '" + livro.getTitulo() + "' está indisponível.");
        }
        user.emprestarLivro(livro);
        livro.setDiponivel(false);
        System.out.println("Empréstimo realizado com sucesso para " + user.getNome());
    }

    public void realizarEmprestimo(LivroInfantil livro, Usuario user){
        if (!livro.isDisponivel()){
            throw new LivroIndisponivelException("Livro indisponível para emprestimo");
        }
        if (user.getIdade() >= livro.getFaixaEtaria()){
            user.emprestarLivro(livro);
            livro.setDiponivel(false);
        } else {
            throw new FaixaEtariaInvalidaException("Usuário " + user.getNome() + " não tem idade suficiente");
        }
    }

    @Override
    public void devolverLivro(Livro livro){
        livro.setDiponivel(true);
        System.out.println("Livro '" + livro.getTitulo() + "' foi devolvido.");
    }
}
