import java.util.ArrayList;
import java.util.Collections;

public class Att04 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add((int) (Math.random() * 100) + 1);
        }
        int max = Collections.max(numeros);
        int min = Collections.min(numeros);
        System.out.println("Números: " + numeros);
        System.out.println("Maior número: " + max);
        System.out.println("Menor número: " + min);
    }
}