import java.util.ArrayList;
import java.util.Scanner;

public class Att23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int i = 1; i <= 5; i++) {
            numeros.add(i);
        }
        
        System.out.println("Digite o valor para multiplicar os elementos da lista:");
        int multiplicador = scanner.nextInt();
        
        System.out.println("Lista após multiplicação:");
        for (int num : numeros) {
            System.out.println(num * multiplicador);
        }
        scanner.close();
    }
}