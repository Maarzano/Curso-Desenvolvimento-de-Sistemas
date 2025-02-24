import java.util.Scanner;

public class Att14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int maior = Integer.MIN_VALUE;
        int somaDiagonalPrincipal = 0;
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }
            }
        }
        sc.close();
        System.out.println("Maior elemento da matriz: " + maior);
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
    }
}