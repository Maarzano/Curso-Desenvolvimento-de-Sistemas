import java.util.Random;
public class Att18 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random rand = new Random();
        int soma = 0;
        int totalElementos = 16;

        System.out.println("Matriz 4x4 com números aleatórios:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(100);
                soma += matriz[i][j];
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        double media = soma / (double) totalElementos;
        System.out.println("Média dos elementos da matriz: " + media);
    }
}