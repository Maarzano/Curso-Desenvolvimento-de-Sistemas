package Program2.Models;
import java.util.*;
public class Pedido {
    private int id;
    private List<Prato> pratos;
    private String status;

    public Pedido(int id){
        this.id =id;
        pratos = new ArrayList<Prato>();
        this.status = "Em preparo";
    }

    public void adicionarPrato(Prato prato){
        pratos.add(prato);

    }
    public int getId(){
        return id;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public String getStatus() {
        return status;
    }
    public void atualizarStatus(String novoStatus){
        this.status = novoStatus;
    }
    
    @Override
    public String toString() {
        return "Pedido " + id + " | Status: " + status + " | Pratos: " + pratos;
    }

}
