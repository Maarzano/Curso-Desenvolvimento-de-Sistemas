import java.util.ArrayList;
import java.util.Scanner;

public class Att01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número:");
            int num = sc.nextInt();
            numeros.add(num);
        }
        sc.close();
        System.out.println("Números digitados: " + numeros);
    }
}
