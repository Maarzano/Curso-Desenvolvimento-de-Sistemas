import java.util.Scanner;

public class att18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o comprimento do primeiro lado: ");
        int lado1 = scanner.nextInt();
        System.out.print("Digite o comprimento do segundo lado: ");
        int lado2 = scanner.nextInt();
        System.out.print("Digite o comprimento do terceiro lado: ");
        int lado3 = scanner.nextInt();
        
        String resultado = (lado1 == lado2 && lado2 == lado3) ? "Equilátero" : 
                           (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) ? "Isósceles" : "Escaleno";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
