import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Att08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite um número:");
            numeros.add(sc.nextInt());
        }
        ArrayList<String> nomes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um nome:");
            String nome = sc.nextLine();
            nomes.add(nome);
        }
        sc.close();
        Collections.sort(numeros);
        System.out.println("Números ordenados: " + numeros);
        Collections.sort(nomes);
        System.out.println("Nomes em ordem alfabética: " + nomes);
    }
}