package Datas_e_horarios;
import java.util.Scanner;

public class DH4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe as horas: ");
        int hora = sc.nextInt();

        if (hora < 12){
            System.out.println("\nEstá de manhã");
        } else if (hora < 18){
            System.out.println("\nEstá de tarde");
        } else if (hora < 24){
            System.out.println("\nEstá de noite");
        } else {
            System.out.println("\nHorário Inválido");
        }
        sc.close();
    }
}