import java.util.Arrays;
import java.util.Scanner;

public class Att17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz3x3 = new int[3][3];

        System.out.println("Digite os elementos de matriz 3x3: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz3x3[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite o número escalar:");
        int escalar = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz3x3[i][j] *= escalar;
            }
        }
        System.out.println("Matriz multiplicada:");
        for (int[] numero: matriz3x3){
            System.out.println(Arrays.toString(numero));
        }
        sc.close();
    }
}
