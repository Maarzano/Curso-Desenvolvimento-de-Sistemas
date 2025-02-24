import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Att09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um nome:");
            nomes.add(sc.nextLine());
        }
        sc.close();
        Collections.sort(nomes);
        System.out.println("Nomes em ordem alfabética: " + nomes);

        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            numeros.add((int) (Math.random() * 100) + 1);
        }
        Collections.reverse(numeros);
        System.out.println("Lista na ordem inversa: " + numeros);
    }
}