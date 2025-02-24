import java.util.ArrayList;

public class Att22 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            numeros.add(i);
        }

        for (int num : numeros) {
            soma += num;
        }

        System.out.println("Soma dos elementos da lista: " + soma);
    }
}