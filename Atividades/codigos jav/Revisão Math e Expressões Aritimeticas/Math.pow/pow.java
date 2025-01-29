public class pow {
    public static void main(String[] args) {

        double[][] powNumbers = {
            {2, 3}, {5, 2}, {10, 0}, {3, 4}, {7, 2}, {2, 10}, {0.5, 2},
            {1, 100}, {4, 0.5}, {-2, 3}, {6, 3}, {8, 2}, {-3, 2}, {9, 0.5},
            {2, -3}, {0.1, 2}, {100, 0.5}, {10, -2}, {-1, 3}, {0, 5}
        };
        
        System.out.println("\nExercícios para Math.pow");
        for (int i = 0; i < powNumbers.length; i++) {
            double base = powNumbers[i][0];
            double exponent = powNumbers[i][1];
            double result = Math.pow(base, exponent);
            System.out.printf("%d. %.3f^%.3f = %.3f\n", i + 1, base, exponent, result);
        }
    }
}
