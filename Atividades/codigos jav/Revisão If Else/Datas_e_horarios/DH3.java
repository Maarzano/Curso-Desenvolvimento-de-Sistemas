package Datas_e_horarios;
import java.util.Scanner;

public class DH3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um dia: ");
        int dia = sc.nextInt();

        if(dia <= 28){
            System.out.println("\nTodos os meses são válidos para esse dia");
        } else if (dia <= 30){
            System.out.println("\nOs meses válidos para esse dia são: Abril, Junho, Setembro, Novembro");
        }else if (dia == 31){
            System.out.println("\nOs meses válidos para esse dia são: Janeiro, Março, Maio, Julho, Agosto, Outubro e Dezembro");
        } else {
            System.out.println("\nDia digitado inválido");
        }
        sc.close();
    }
}