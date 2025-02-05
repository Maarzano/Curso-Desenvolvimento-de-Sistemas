import java.util.Scanner;

public class att2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva sua idade: ");
        int idade = sc.nextInt();
        String ehMaior = (idade >= 18) ? "Maior" : "Menor";
        System.out.println(ehMaior);
        sc.close();
    }
}
