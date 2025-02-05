public class Att52 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        System.out.println("Os primeiros 10 números primos são:");
        do {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
                count++;
            }
            num++;
        } while (count < 10);
    }
}
