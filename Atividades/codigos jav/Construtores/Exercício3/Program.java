package Exercício3;

import Exercício3.Models.*;
public class Program {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("João Silva", 1500.50, "Poupança");

        ContaBancaria conta2 = new ContaBancaria("Maria Oliveira");

        System.out.println("Informações da Conta 1:");
        conta1.exibirInformacoes();

        System.out.println("\nInformações da Conta 2:");
        conta2.exibirInformacoes();
    }
}
