public class abs {
    public static void main(String[] args) {

        double[] absNumbers = {-10, 15, 0, -5.5, -100, -0.01, -1234, 3.1415, -999, -1,
            -25, 50, -0.5, -2.718, -777, -100000, -0.0001, 42, -8.8, -500};

        System.out.println("\nExercícios para Math.abs");

        for (int i = 0; i < absNumbers.length; i++) {

            double result = Math.abs(absNumbers[i]);
            System.out.printf("%d. |%.3f| = %.3f\n", i + 1, absNumbers[i], result);
            
        }


    }
}
