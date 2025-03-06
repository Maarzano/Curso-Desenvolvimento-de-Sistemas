package Models;

public class Employee {
    private String Name;
    private double GrossSalary;
    private double Tax;
    
    public Employee(String nome, double SalarioBruto, double taxa){
        Name = nome;
        GrossSalary = SalarioBruto;
        Tax = taxa;
    }

    public String getName(){
        return Name;
    }
    public double NetSalary(){
        return GrossSalary - Tax;
    }

    public void IncreaseSalary(double Porcento){
        GrossSalary += GrossSalary * (Porcento/100);
    }

    @Override
    public String toString() {
        return "Employee: " + Name +
               ", Gross Salary: $" + String.format("%.2f", GrossSalary) +
               ", Net Salary: $" + String.format("%.2f", NetSalary());
    }

}
