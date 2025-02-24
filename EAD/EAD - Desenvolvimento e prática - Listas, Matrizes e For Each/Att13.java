import java.util.Scanner;

public class Att13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        sc.close();
        System.out.println("Soma dos elementos da matriz: " + soma);
        System.out.println("Maior elemento: " + maior);
    }
}