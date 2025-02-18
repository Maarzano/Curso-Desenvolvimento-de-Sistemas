package attgerais;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class att8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo: ");
        String caminho = sc.nextLine();

        try {
            File arquivo = new File(caminho);
            Scanner arquivoScanner = new Scanner(arquivo);

            while (arquivoScanner.hasNextLine()) {
                String linha = arquivoScanner.nextLine();
                System.out.println(linha);
            }

            arquivoScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado. " + e.getMessage());
        } catch (Exception ex) {
            System.out.println("Erro ao ler o arquivo: " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
