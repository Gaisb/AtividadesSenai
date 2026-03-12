package br.senai.ds2026.javafundamentos.aula01_console.Atividade2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exemplo4DescontoCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        System.out.println("=== VERIFICAÇÃO DE DESCONTO NA COMPRA ===");

        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Valor total da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        double desconto = 0.0;
        double valorFinal = valorCompra;

        // Verificação de desconto
        if (valorCompra > 200.00) {
            desconto = valorCompra * 0.10;
            valorFinal = valorCompra - desconto;
        }

        // Saída organizada
        System.out.println("\n=== RESUMO DA COMPRA ===");
        System.out.println("Cliente:           " + nomeCliente);
        System.out.println("Valor da compra:   " + df.format(valorCompra));

        if (desconto > 0) {
            System.out.println("Valor do desconto: " + df.format(desconto) + " (10%)");
            System.out.println("Valor final:       " + df.format(valorFinal));
        } else {
            System.out.println("Desconto:          Sem desconto (compra ≤ R$ 200,00)");
            System.out.println("Valor final:       " + df.format(valorFinal));
        }

        scanner.close();
    }
}