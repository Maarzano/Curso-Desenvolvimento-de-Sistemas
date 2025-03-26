package Att3.Models;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salário){
        super(nome, salário);
    }
    @Override
    public double CalcularSalario(){
        return salário += 500;
    }
}
