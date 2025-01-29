package Datas_e_horarios;
import java.util.Scanner;

public class DH5 {
    public static void main(String[] args) {
        int datainicio = 15;
        int datafinal = 25;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um dia do mês: ");
        int data = sc.nextInt();

        if (data >= datainicio && data <= datafinal){
            System.out.println("\nA data informada está dentro do periodo");
        } else {
            System.out.println("\nA data informada está fora do periodo");
        }
        sc.close();
    }
}