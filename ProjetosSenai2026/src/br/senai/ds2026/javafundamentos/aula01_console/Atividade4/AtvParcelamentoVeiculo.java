package br.senai.ds2026.javafundamentos.aula01_console.Atividade4;

import java.util.Scanner;

public class AtvParcelamentoVeiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SIMULAÇÃO DE PARCELAMENTO DE VEÍCULO ===");
        System.out.print("Informe o valor do veículo: R$ ");
        double valorCarro = scanner.nextDouble();

        if (valorCarro <= 0) {
            System.out.println("Valor inválido!");
            scanner.close();
            return;
        }

        double precoAvista = valorCarro * 0.80; // 20% de desconto

        System.out.println("\nPreço à vista (20% de desconto): R$ " + String.format("%.2f", precoAvista));
        System.out.println("\nOpções de parcelamento:");
        System.out.println("Parcelas\tPreço Final\t\tValor da Parcela");
        System.out.println("--------------------------------------------------");

        int[] parcelas = {6, 12, 18, 24, 30, 36, 42, 48, 54, 60};
        double[] acrescimos = {0.03, 0.06, 0.09, 0.12, 0.15, 0.18, 0.21, 0.24, 0.27, 0.30};

        for (int i = 0; i < parcelas.length; i++) {
            int qtdParcelas = parcelas[i];
            double percentual = acrescimos[i];

            double precoFinal = valorCarro * (1 + percentual);
            double valorParcela = precoFinal / qtdParcelas;

            System.out.printf("%d\t\tR$ %,.2f\t\tR$ %,.2f%n",
                    qtdParcelas, precoFinal, valorParcela);
        }

        System.out.println("\nEscolha a melhor opção para você!");

        scanner.close();
    }
}
