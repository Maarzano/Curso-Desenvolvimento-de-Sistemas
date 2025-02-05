public class Att53 {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        System.out.println("Sequência de números triangulares até o décimo termo:");
        do {
            sum += count;
            System.out.println(sum);
            count++;
        } while (count <= 10);
    }
}
