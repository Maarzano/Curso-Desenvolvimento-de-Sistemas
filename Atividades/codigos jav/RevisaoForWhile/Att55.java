public class Att55 {
    public static void main(String[] args) {
        int i = 1;
        int j;

        System.out.println("Triângulo de números com base 5:");
        do {
            j = 1;
            do {
                System.out.print(i + " ");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= 5);
    }
}
