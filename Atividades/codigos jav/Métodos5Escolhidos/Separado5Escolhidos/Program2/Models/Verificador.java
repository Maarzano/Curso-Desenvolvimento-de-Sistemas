package Métodos5Escolhidos.Separado5Escolhidos.Program2.Models;

public class Verificador {
    public boolean ComecaCom(String texto, String letra){
        return (String.valueOf(texto.charAt(0)).equalsIgnoreCase(letra));
    }
}
