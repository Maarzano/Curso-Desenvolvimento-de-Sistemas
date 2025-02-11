package Program2.Models;

import java.util.List;
import java.util.ArrayList;

public class Restaurante {
    private List<Prato> Cardapio = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();
    private int proximoPedido = 1;

    public void adicionarPratoAoCardapio(int id, String nome, double preco){
        Cardapio.add(new Prato(id, nome, preco));
    }
    public void exibirCardapio(){
        System.out.println("Cardápio: ");
        for (Prato pratos : Cardapio){
            System.out.println(pratos);
        }
    }
    public Pedido criarPedido(List<Integer> idsPratos) {
        Pedido novoPedido = new Pedido(proximoPedido++);
        for (int id : idsPratos) {
            for (Prato prato : Cardapio) {
                if (prato.getId() == id) {
                    novoPedido.adicionarPrato(prato);
                }
            }
        }
        pedidos.add(novoPedido);
        return novoPedido;
    }

    public void listarPedidosPendentes() {
        System.out.println("Pedidos Pendentes:");
        for (Pedido pedido : pedidos) {
            if (!pedido.getStatus().equals("Entregue")) {
                System.out.println(pedido);
            }
        }
    }

    public void atualizarStatusPedido(int idPedido, String novoStatus) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == idPedido) {
                pedido.atualizarStatus(novoStatus);
                System.out.println("Pedido " + idPedido + " atualizado para: " + novoStatus);
                return;
            }
        }
        System.out.println("Pedido não encontrado.");

    }
}
