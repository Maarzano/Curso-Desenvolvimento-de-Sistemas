import java.util.*;

public class Att31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Lista = new ArrayList<>();
        System.out.println("Escreva um número (insira número negativo para parar)");

        while(true){
            int num = sc.nextInt();
            if (num < 0){
                break;
            }
            Lista.add(num);
        }
        for (var recebe : Lista){
            System.out.println(recebe);
        }
        sc.close();
    }
}
