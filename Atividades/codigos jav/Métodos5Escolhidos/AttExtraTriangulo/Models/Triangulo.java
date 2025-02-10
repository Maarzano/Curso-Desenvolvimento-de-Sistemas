package Models;

public class Triangulo {

    public double base;
    public double altura;

    public Triangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    public double CalculoArea(){
        return (base * altura) / 2;
    }

    public static String VerificarMaiorArea(Triangulo triangulo1, Triangulo triangulo2){
        double area1 =triangulo1.CalculoArea();
        double area2 = triangulo2.CalculoArea();
        String maiorArea = ((area1 > area2) ? "triangulo 1 com ârea " + area1 : "triangulo 2 com ârea " + area2);
        return "O Triângulo com maior ârea é " + maiorArea;

    }
}
