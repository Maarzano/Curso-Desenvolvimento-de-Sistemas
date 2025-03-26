package Att3;

import Att3.Models.Desenvolvedor;
import Att3.Models.Funcionario;
import Att3.Models.Gerente;

public class Main {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("arthur", 1000);
        Gerente gerente = new Gerente("Patrícia", 500);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Gb", 100);
        System.out.println("FUncionário: " + func.CalcularSalario() + ", gerenete: " + ", " + gerente.CalcularSalario() + ", desenvolvedor: " + desenvolvedor.CalcularSalario());
    }
}
