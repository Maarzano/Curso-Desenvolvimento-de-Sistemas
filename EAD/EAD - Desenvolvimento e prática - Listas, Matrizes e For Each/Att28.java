public class Att28 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int maior = Integer.MIN_VALUE;

        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento > maior) {
                    maior = elemento;
                }
            }
        }

        System.out.println("Maior elemento da matriz: " + maior);
    }

}
