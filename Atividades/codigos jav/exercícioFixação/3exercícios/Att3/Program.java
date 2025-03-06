import java.util.Scanner;

import Models.Estudante;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();

        Estudante student = new Estudante(nome, nota1, nota2, nota3);

        System.out.println(student);

        sc.close();
        
    }
}
