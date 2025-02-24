import java.util.ArrayList;

public class Att21 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numeros.add(i);
        }

        System.out.println("Elementos da lista:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
