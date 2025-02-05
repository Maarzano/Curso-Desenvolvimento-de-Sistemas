import java.util.Scanner;

public class Att32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma =0;
        System.out.println("Digite números (0 para sair)");
        do {
            int nums = sc.nextInt();
            if (nums !=0) {
                soma += nums;
            } else break;
        }while (true);
        System.out.println(soma);
    }
}
