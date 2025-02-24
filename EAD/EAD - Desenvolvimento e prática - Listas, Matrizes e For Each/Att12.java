import java.util.Scanner;

public class Att12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
            }
        }
        sc.close();
        System.out.println("Soma dos elementos: " + soma);
    }
}