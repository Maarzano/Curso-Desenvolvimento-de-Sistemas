import java.util.ArrayList;
import java.util.Scanner;

public class Att10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> lista3 = new ArrayList<>();
        System.out.println("Digite 5 números para a primeira lista:");
        for (int i = 0; i < 5; i++) {
            lista1.add(sc.nextInt());
        }
        System.out.println("Digite 5 números para a segunda lista:");
        for (int i = 0; i < 5; i++) {
            lista2.add(sc.nextInt());
        }
        sc.close();
        lista3.addAll(lista1);
        lista3.addAll(lista2);
        System.out.println("Terceira lista (junção das duas): " + lista3);
    }
}