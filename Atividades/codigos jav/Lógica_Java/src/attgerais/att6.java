package attgerais;

import java.util.Scanner;

public class att6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        try {
            int num = Integer.parseInt(sc.nextLine());
            System.out.println("Número digitado: " + num);
        } catch (Exception ex){
            System.out.println("ínvalido");
        } finally {
            System.out.println("Terminou código");
        }
        sc.close();
    }
}
