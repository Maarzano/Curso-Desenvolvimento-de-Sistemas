package Att7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;

        try {
            for (int i = 1; i <= 3; i++) {
                System.out.print("Digite a nota " + i + ": ");
                soma += sc.nextDouble();
            }
            double media = soma / 3;
            System.out.println("Média das notas: " + media);
        } catch (Exception ex) {
            System.out.println("Erro: Entrada inválida! Certifique-se de inserir números.");
        } finally{
            sc.close();
        }
    }

}
