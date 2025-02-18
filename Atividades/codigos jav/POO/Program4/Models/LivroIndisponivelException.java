package Program4.Models;
public class LivroIndisponivelException extends RuntimeException{
    public LivroIndisponivelException(String message){
        super(message);
    }
}
