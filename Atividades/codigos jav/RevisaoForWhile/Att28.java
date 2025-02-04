public class Att28 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        
        for (int num : array) {
            sum += num;
        }
        
        double average = (double) sum / array.length;
        System.out.println("A média dos números do vetor é " + average);
    }
}