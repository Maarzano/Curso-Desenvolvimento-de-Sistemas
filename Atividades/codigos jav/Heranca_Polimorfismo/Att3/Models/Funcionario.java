package Att3.Models;

public class Funcionario {
    protected String nome;
    protected  double salárioBase;

    public Funcionario(String nome, double salário){
        this.nome = nome;
        this.salárioBase = salário;
    }

    public double CalcularSalario(){
        return this.salárioBase;
    }
}
