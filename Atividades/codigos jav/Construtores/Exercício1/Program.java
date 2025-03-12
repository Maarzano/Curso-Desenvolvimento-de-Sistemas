import Models.*;
public class Program {
        public static void main(String[] args) {
                Carro meuCarro = new Carro("Toyota", 2020);

                System.out.println("Marca: " + meuCarro.getMarca());
                System.out.println("Ano: " + meuCarro.getAno());
        }
}
