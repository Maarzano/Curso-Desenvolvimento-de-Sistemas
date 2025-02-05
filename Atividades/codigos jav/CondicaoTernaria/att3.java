import java.util.Scanner;

public class att3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um número");
        int num = sc.nextInt();
        String Tern = (num >= 0) ? "positivo" : "Negativo";
        System.out.println(Tern);
    }
}
