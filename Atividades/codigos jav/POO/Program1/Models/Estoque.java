package Program1.Models;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque(){
        produtos = new ArrayList<>();
    }
    public void adicionarProdutoAoEstoque(Produto produto){
        produtos.add(produto);
    }
    public void removerProdutoDoEstoque(int id){
        Produto produtoRemover = null;

        for(var recebe : produtos){
            if(recebe.getId() == id){
                produtoRemover = recebe;
                break;
            }
        }
        if(produtoRemover != null){
            produtos.remove(produtoRemover);
        } else {
            System.out.println("O produto com ID " + id + " não foi encontrado");
        }
    }

    public void exibirEstoque() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            for (Produto produto : produtos) {
                System.out.println(produto);
                System.out.println("----------------------------");
            }
        }
    }
}
