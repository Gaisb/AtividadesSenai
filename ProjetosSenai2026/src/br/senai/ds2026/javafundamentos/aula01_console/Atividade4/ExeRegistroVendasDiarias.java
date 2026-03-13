package br.senai.ds2026.javafundamentos.aula01_console.Atividade4;

import java.util.Scanner;

    public class ExeRegistroVendasDiarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorVenda;
        double totalVendas = 0.0;
        int quantidadeVendas = 0;

        System.out.println("=== REGISTRO DE VENDAS DIÁRIAS ===");
        System.out.print("Informe o valor da venda (0 para encerrar): ");
        valorVenda = scanner.nextDouble();

        while (valorVenda != 0) {
            if (valorVenda < 0) {
                System.out.println("Valor inválido! Informe um valor positivo.");
            } else {
                totalVendas += valorVenda;
                quantidadeVendas++;
            }
            System.out.print("Informe o valor da venda (0 para encerrar): ");
            valorVenda = scanner.nextDouble();
        }

        System.out.println("\n=== RESUMO DAS VENDAS ===");
        System.out.println("Quantidade total de vendas registradas: " + quantidadeVendas);
        System.out.printf("Valor total arrecadado: R$ %.2f%n", totalVendas);

        scanner.close();
    }
}