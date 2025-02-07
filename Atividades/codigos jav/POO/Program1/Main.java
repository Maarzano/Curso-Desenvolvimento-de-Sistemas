package Program1;
import Program1.Models.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa ps = new Pessoa();
        Pessoa ps1 = new Pessoa();

        ps.nome = "Vitor";
        ps.idade = 19;

        ps.Apresentar();

    }
}
