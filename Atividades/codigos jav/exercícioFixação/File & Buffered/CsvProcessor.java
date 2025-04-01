import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CsvProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo CSV: ");
        String sourceFilePath = sc.nextLine();

        Path sourcePath = Paths.get(sourceFilePath);
        Path outputDir = sourcePath.getParent().resolve("out");
        Path outputFile = outputDir.resolve("summary.csv");

        try {
            Files.createDirectories(outputDir);
        } catch (IOException e) {
            System.out.println("Erro ao criar diretório: " + e.getMessage());
            return;
        } finally {
            sc.close();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile.toString()))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");

                if (fields.length != 3) {
                    System.out.println("Linha inválida ignorada: " + line);
                    continue;
                }

                String name = fields[0].trim();
                double price = Double.parseDouble(fields[1].trim());
                int quantity = Integer.parseInt(fields[2].trim());
                double totalValue = price * quantity;

                bw.write(name + "," + String.format("%.2f", totalValue));
                bw.newLine();
            }

            System.out.println("Arquivo 'summary.csv' criado com sucesso em: " + outputFile.toAbsolutePath());

        } catch (IOException e) {
            System.out.println("Erro ao processar o arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter número: " + e.getMessage());
        }

        sc.close();
    }
}
