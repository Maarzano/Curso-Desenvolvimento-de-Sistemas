package Att6;

import java.util.Scanner;

import Att6.Exceptions.DadosInvalidosException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();
            if (nome.isEmpty()) {
                throw new DadosInvalidosException("Nome não pode ser vazio!");
            }

            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();
            if (idade < 0) {
                throw new DadosInvalidosException("Idade não pode ser negativa!");
            }

            System.out.println("Cadastro realizado com sucesso!");
        } catch (DadosInvalidosException ex) {
            System.out.println("Erro: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Erro: Entrada inválida!");
        } finally{
            sc.close();
        }
    
    }
}
