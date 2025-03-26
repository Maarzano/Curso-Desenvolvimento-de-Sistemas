package Att2;

import Att2.Models.Bicicleta;
import Att2.Models.Carro;
import Att2.Models.Veiculo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro();
        Veiculo veiculo2 = new Bicicleta();

        ArrayList<Veiculo> lista = new ArrayList<>();
        lista.add(veiculo2);
        lista.add(veiculo1);

        for (var recebe : lista){
            recebe.mover();
        }

    }
}
