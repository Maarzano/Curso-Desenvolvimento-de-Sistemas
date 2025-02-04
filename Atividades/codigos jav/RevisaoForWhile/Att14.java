public class Att14 {
    public static void main(String[] args) {

        for (int i = 2; i<=50;i++){

            boolean ehPrimo = true;
            
            for(int j = 2;j< i;j++){
                if (i % j==0){
                    ehPrimo = false;
                    break;
                }
            }
            if(ehPrimo){
                System.out.println(i);
            }
        }
    }
}
