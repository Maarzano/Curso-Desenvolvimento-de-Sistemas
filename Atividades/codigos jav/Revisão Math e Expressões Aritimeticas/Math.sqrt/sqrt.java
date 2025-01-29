public class sqrt {
    public static void main(String[] args) {
        
        double[] sqrtNumbers = {16, 81, 2, 0, 144, 225, 0.25, 1, 10, 400, 0.04, 121, 625, 50, 900, 10000, 0.001, 36, 49, 169};

        System.out.println("Exercícios para Math.sqrt");

        for (int i = 0; i < sqrtNumbers.length; i++) {

            double result = Math.sqrt(sqrtNumbers[i]);
            
            System.out.printf("%d. sqrt(%.3f) = %.3f\n", i + 1, sqrtNumbers[i], result);

        }
    }
}
