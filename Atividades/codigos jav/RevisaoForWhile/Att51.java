public class Att51 {
    public static void main(String[] args) {
        int count = 0;
        int num = 1;

        System.out.println("Os primeiros 10 números perfeitos são:");
        do {
            int sum = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(num);
                count++;
            }
            num++;
        } while (count < 10);
    }
}
