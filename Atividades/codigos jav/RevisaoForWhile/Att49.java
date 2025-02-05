import java.util.Random;

public class Att49 {
    public static void main(String[] args) {
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
        int length = 6;
        int i = 0;

        do {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
            i++;
        } while (i < length);

        System.out.println("Senha gerada: " + password.toString());
    }
}
