package br.senai.ds2026.javafundamentos.aula01_console.Atividade1;

import java.util.Scanner;

public class Exemplo2CadastroDeProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CADASTRO DE PRODUTO ===\n");

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Código do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.print("Preço unitário: ");
        double precoUnitario = scanner.nextDouble();

        System.out.print("Quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        // Cálculo
        double valorTotal = precoUnitario * quantidade;

        // Saída
        System.out.println("\n=== RESUMO DO PRODUTO ===\n");

        System.out.println("Produto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.printf("Preço unitário: R$ %.2f%n", precoUnitario);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.printf("Valor total em estoque: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}