package Att3.Models;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salário){
        super(nome, salário);
    }
    @Override
    public double CalcularSalario(){
        return salário += salário * 0.1;
    }
}
