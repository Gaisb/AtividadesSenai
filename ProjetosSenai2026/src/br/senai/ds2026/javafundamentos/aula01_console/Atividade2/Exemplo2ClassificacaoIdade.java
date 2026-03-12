package br.senai.ds2026.javafundamentos.aula01_console.Atividade2;

import java.util.Scanner;

public class Exemplo2ClassificacaoIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CADASTRO DE PESSOA ===");

        System.out.print("Nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        // Classificação com if/else
        String faixaEtaria;
        if (idade < 18) {
            faixaEtaria = "Menor de idade";
        } else if (idade <= 59) {
            faixaEtaria = "Adulto";
        } else {
            faixaEtaria = "Idoso";
        }

        // Saída organizada
        System.out.println("\n=== RESULTADO DO CADASTRO ===");
        System.out.println("Nome:            " + nome);
        System.out.println("Idade:           " + idade + " anos");
        System.out.println("Faixa etária:    " + faixaEtaria);

        scanner.close();
    }
}