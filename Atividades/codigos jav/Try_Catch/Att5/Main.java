package Att5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um índice para acessar o array: ");
        try {
            int index = sc.nextInt();
            System.out.println("Valor no índice " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Erro: Índice fora dos limites do array!");
        } catch (Exception ex) {
            System.out.println("Erro: Entrada inválida!");
        }
        sc.close();

    }
}
