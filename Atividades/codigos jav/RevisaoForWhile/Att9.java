import java.util.Scanner;

public class Att9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        for (int i = 0; i <= 10;i++){
            System.out.println(num + "x" + i + " = "  + i * num);
        }
    }
}
