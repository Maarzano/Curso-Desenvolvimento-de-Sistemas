package Att4.Models;

public class PagamentoCartao extends Pagamento {

    @Override
    public void RealizarPagamento(){
        System.out.println("\nIniciando pagamento no cartão");
        super.RealizarPagamento();
        System.out.println("Pagamento no cartão finalizado");

    }

}
