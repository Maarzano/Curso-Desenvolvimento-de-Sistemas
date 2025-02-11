package Program2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Program2.Models.Pedido;
import Program2.Models.Restaurante;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurante restaurante = new Restaurante();

        restaurante.adicionarPratoAoCardapio(1, "Pizza", 25.0);
        restaurante.adicionarPratoAoCardapio(2, "Hambúrguer", 15.0);
        restaurante.adicionarPratoAoCardapio(3, "Salada", 12.0);
        restaurante.adicionarPratoAoCardapio(4, "Refrigerante", 5.0);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Ver cardápio");
            System.out.println("2. Fazer pedido");
            System.out.println("3. Ver pedidos pendentes");
            System.out.println("4. Atualizar status do pedido");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                restaurante.exibirCardapio();
            } else if (opcao == 2) {
                System.out.println("Digite os IDs dos pratos separados por espaço:");
                String[] idsStr = scanner.nextLine().split(" ");
                List<Integer> idsPratos = new ArrayList<>();
                for (String idStr : idsStr) {
                    idsPratos.add(Integer.parseInt(idStr));
                }
                Pedido pedido = restaurante.criarPedido(idsPratos);
                System.out.println("Pedido criado: " + pedido);
            } else if (opcao == 3) {
                restaurante.listarPedidosPendentes();
            } else if (opcao == 4) {
                System.out.print("Digite o ID do pedido: ");
                int idPedido = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Novo status (Em preparo / Pronto / Entregue): ");
                String novoStatus = scanner.nextLine();
                restaurante.atualizarStatusPedido(idPedido, novoStatus);
            } else if (opcao == 5) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();


    }
}
