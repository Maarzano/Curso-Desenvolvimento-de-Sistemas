public class aritimeticas {
    public static void main(String[] args) {

        double[] expressions = {
            (10 + 5) * 2,
            (20 - 4) / 2.0,
            15 + 3 * 2,
            100 / (2 + 3.0),
            25 % 4,
            (30 - 5) * (2 + 3),
            (50 / 2) + (8 * 3),
            2 * (3 + 4) - 5,
            100 - (25 / 5),
            (8 + 2) * (6 - 4),
            45 % (7 + 3),
            (12 / 3.0) + (18 / 6.0),
            Math.pow(2, 3) + 5 * 2,
            (15 - 5) * Math.pow(3, 2),
            (8 % 3) + (6 / 2.0),
            (7 + 5) - (3 * 2),
            (9 * 9) - (81 / 9),
            (50 / (5 + 5.0)) + 10,
            (16 % 5) * (7 - 3),
            (10 + 5) / Math.pow(2, 2)
        };

        System.out.println("\nExercícios com expressões aritméticas");
        
        for (int i = 0; i < expressions.length; i++) {
            System.out.printf("%d. Resultado: %.3f\n", i + 1, expressions[i]);
        }
        
    }
}
