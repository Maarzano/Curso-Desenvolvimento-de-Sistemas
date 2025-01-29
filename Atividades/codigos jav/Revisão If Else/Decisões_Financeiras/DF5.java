package Decisões_Financeiras;

import java.util.Scanner;

public class DF5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da compra: ");
        double valor = sc.nextDouble();

        if (valor > 200.00) {
            System.out.println("\nO cliente tem direito a um brinde");
        } else {
            System.out.println("\nValor mínimo para brinde não atingido");
        }
        sc.close();
    }
}
