import java.util.Scanner;

public class att1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um número inteiro positivo");
        int num = sc.nextInt();
        var ehParOuImpar = (num % 2==0) ? "Par" : "Ímpar";

        System.out.println(ehParOuImpar);

    }
}
