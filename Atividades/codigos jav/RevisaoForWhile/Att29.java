public class Att29 {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        
        System.out.println("Vetor ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}