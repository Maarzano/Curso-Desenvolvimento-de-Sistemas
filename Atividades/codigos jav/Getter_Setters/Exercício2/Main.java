package Exercício2;

import Exercício2.Models.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Arthur", 0);
        conta1.Depositar(10);
        conta1.ExibirSaldo();
        conta1.Sacar(5);
        conta1.ExibirSaldo();
        conta1.Depositar(10.50);
        conta1.ExibirSaldo();
        conta1.Sacar(100);

    }
}
