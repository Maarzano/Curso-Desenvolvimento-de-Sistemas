package Att3.Models;

public class Funcionario {
    protected String nome;
    protected  double salário;

    public Funcionario(String nome, double salário){
        this.nome = nome;
        this.salário = salário;
    }

    public double CalcularSalario(){
        return this.salário;
    }
}
