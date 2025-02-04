public class Att6 {
    public static void main(String[] args) {
        var soma = 0;
        for(int i = 0; i <= 100;i++){
            if (i % 2 == 0){
                soma += i;
            }
            System.out.println(soma);
        }
    }
}