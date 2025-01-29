package Decisões_Financeiras;
import java.util.Scanner;

public class DF2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o valor da compra: ");
        double valor = sc.nextFloat();

        double desconto = 0.1;
        double valorfinal;

        if (valor > 500.00) {
            System.out.println("\nValor da Compra: R$" + valor);
            System.out.println("Desconto: R$"+ valor*desconto);

            valorfinal = valor*(1-desconto);

            System.out.println("Valor Final: R$" + valorfinal);
        } else {
            System.out.println("\nValor da Compra: R$" + valor);
        }
        sc.close();
    }
}