import java.util.ArrayList;
import java.util.Scanner;

public class Att02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número:");
            int num = sc.nextInt();
            numeros.add(num);
            soma += num;
        }
        sc.close();
        System.out.println("Soma dos números: " + soma);
    }
}