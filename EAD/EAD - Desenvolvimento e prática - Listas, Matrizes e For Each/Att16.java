import java.util.Arrays;
import java.util.Scanner;

public class Att16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz");
        int tamanho = sc.nextInt();
        sc.close();
        int[][] identidade = new int[tamanho][tamanho];
        for(int i = 0; i < identidade.length; i++){
            identidade[i][i] = 1;
        }
        System.out.println("Matriz Identidade:");

        for (int[] numero: identidade){
            System.out.println(Arrays.toString(numero));
        }
    }

}
