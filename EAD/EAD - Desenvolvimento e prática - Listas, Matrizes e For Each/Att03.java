import java.util.ArrayList;
import java.util.Scanner;

public class Att03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Digite um número:");
            int num = sc.nextInt();
            numeros.add(num);
            soma += num;
        }
        sc.close();
        double media = soma / 6.0;
        System.out.println("Média dos valores: " + media);
    }
}