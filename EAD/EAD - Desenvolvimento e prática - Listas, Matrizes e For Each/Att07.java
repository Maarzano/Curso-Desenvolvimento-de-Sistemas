import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Att07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite um número:");
            int num = sc.nextInt();
            numeros.add(num);
        }
        sc.close();
        Collections.sort(numeros);
        System.out.println("Números ordenados: " + numeros);
    }
}