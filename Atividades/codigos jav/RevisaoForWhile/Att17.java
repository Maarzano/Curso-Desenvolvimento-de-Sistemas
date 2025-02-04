import java.util.Scanner;

public class Att17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        String texto =  sc.nextLine().toLowerCase();

        char[] arraytexto = texto.toCharArray();

        String deTraspraFrente = "";

        for(int i = arraytexto.length - 1; i >= 0; i--){
            deTraspraFrente+= arraytexto[i];
        }
        System.out.println(deTraspraFrente);
        sc.close();
    }
}
