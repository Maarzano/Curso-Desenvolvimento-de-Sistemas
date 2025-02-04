public class Att13 {
    public static void main(String[] args) {
        int a = 0, b =1;
        for(int i =0;i <=10;i++){
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;

        }
    }
}
