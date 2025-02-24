import java.util.ArrayList;

public class Att25 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("José");
        nomes.add("Ana");
        nomes.add("Carlos");

        
        for (String nome : nomes) {
            System.out.println("Olá, " + nome + "!");
        }
    }
}