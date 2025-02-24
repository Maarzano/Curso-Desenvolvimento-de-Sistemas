import java.util.ArrayList;

public class Att24 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        
        System.out.println("Números pares da lista:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}