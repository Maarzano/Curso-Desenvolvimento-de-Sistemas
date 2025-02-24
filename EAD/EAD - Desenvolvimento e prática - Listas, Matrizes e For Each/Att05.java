import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Att05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add((int) (Math.random() * 100) + 1);
        }
        int maior = Collections.max(numeros);
        int menor = Collections.min(numeros);
        System.out.println("Números: " + numeros);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Digite um número para verificar se está na lista:");
        int num = sc.nextInt();
        sc.close();
        if (numeros.contains(num)) {
            System.out.println("O número " + num + " está na lista.");
        } else {
            System.out.println("O número " + num + " não está na lista.");
        }
    }
}