import java.util.Scanner;

import Models.Employee;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.println("Salario bruto: ");
        double salario = sc.nextDouble();

        System.out.println("Taxa");
        double taxa = sc.nextDouble();

        Employee empregado = new Employee(name, salario, taxa);

        System.out.println(empregado);

        System.out.println("Quantos porcento quer aumentar do salário? ");
        double aumentar = sc.nextDouble();

        empregado.IncreaseSalary(aumentar);

        System.out.println(empregado);

    }
}
