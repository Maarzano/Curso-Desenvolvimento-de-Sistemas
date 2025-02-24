import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Att06 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(12, 25, 37, 40, 52, 63, 78, 91, 100, 13));

        numeros.removeIf(n -> n % 2 != 0);

        System.out.println("Lista sem números ímpares: " + numeros);
    }
}