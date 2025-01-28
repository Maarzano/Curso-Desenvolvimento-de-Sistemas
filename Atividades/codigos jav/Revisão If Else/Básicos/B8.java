package Básicos;

import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma Letra");
        char le = sc.nextLine().charAt(0);

        if (le == 'a' || le == 'e' || le == 'i'|| le == 'o' || le == 'u'){
            System.out.println("É vogal");
        } else{
            System.out.println("Não é vogal");
        }
        sc.close();
    }
}
