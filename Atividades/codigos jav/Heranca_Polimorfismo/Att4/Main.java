package Att4;

import Att4.Models.Pagamento;
import Att4.Models.PagamentoCartao;
import Att4.Models.PagamentoDinheiro;

public class Main {
    public static void main(String[] args) {

        Pagamento pagar = new Pagamento();
        PagamentoCartao pagarCartao = new PagamentoCartao();
        PagamentoDinheiro pagarDinheiro = new PagamentoDinheiro();


        Pagamento[] pagamentos = {pagar, pagarCartao, pagarDinheiro};

        for (var recebe : pagamentos){
            recebe.RealizarPagamento();
        }
        
    }
}
