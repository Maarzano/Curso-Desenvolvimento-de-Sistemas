package Métodos5Escolhidos.Separado5Escolhidos.Program3.Models;

public class Calculador {
    public double maiorNota(double num1, double num2, double num3){
        double result;
        if(num1 > num2 && num2 > num3){
            result = num1;
        } else if (num2 > num1 && num1 > num3){
            result  = num2;
        } else result = num3;
        return  result;
    }
    public double menorNota(double num1, double num2, double num3){
        double result;
        if(num1 < num2 && num2 < num3){
            result = num1;
        } else if (num2 < num1 && num1 < num3){
            result  = num2;
        } else result = num3;
        return  result;
    }

    public void  maiorMenor(double num1, double num2, double num3){
        System.out.println("Menor nota: " + menorNota(num1, num2, num3));
        System.out.println("Maior nota: " + maiorNota(num1, num2, num3));
    }

}
