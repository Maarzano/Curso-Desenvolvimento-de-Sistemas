package Exercício2.Models;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        this.saldo = saldo;
        this.titular = titular;
    }
    public void Depositar(double valor){
        if (valor > 0){
            saldo += valor;
        } else{
            throw new RuntimeException("não pode depositar um valor negativo");
        }
    }
    public void Sacar(int valor){
        if (saldo >= valor){
            saldo -= valor;
        } else{
            throw new RuntimeException("não tem valor suficiente para essa retirada");
        }
    }
    public void ExibirSaldo(){
        System.out.println("saldo atual: " + saldo);
    }
    public String getTitular(){
        return titular;
    }
    
}
