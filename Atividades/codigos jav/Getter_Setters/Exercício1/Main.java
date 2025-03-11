package Exercício1;

import Exercício1.Models.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Arthur", 19);

        pessoa1.Apresentar();
        pessoa1.setNome("Lmbo");
        pessoa1.Apresentar();
        pessoa1.setIdade(123);
        pessoa1.Apresentar();
    }
}
