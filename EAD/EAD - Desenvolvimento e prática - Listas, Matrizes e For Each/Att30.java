import java.util.ArrayList;

public class Att30 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        numeros.add(5);
        numeros.add(-3);
        numeros.add(8);
        numeros.add(-2);
        numeros.add(4);
        
        System.out.println("Lista após substituição de negativos por zero:");
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < 0) {
                numeros.set(i, 0);
            }
        }

        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
