package br.senai.ds2026.javafundamentos.aula01_console.Atividade2;

import java.util.Scanner;

public class Exemplo3AtendimentoSetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== REGISTRO DE ATENDIMENTO ===");

        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Número do atendimento: ");
        String numeroAtendimento = scanner.nextLine();

        System.out.print("Código do setor (1-Financeiro | 2-Suporte Técnico | 3-RH | 4-Comercial): ");
        int codigoSetor = scanner.nextInt();

        // Identificação do setor com switch
        String setor;
        switch (codigoSetor) {
            case 1:
                setor = "Financeiro";
                break;
            case 2:
                setor = "Suporte Técnico";
                break;
            case 3:
                setor = "Recursos Humanos";
                break;
            case 4:
                setor = "Comercial";
                break;
            default:
                setor = "Setor inválido";
                break;
        }

        // Saída organizada
        System.out.println("\n=== RESUMO DO ATENDIMENTO ===");
        System.out.println("Cliente:              " + nomeCliente);
        System.out.println("Nº do atendimento:    " + numeroAtendimento);
        System.out.println("Código do setor:      " + codigoSetor);
        System.out.println("Setor responsável:    " + setor);

        scanner.close();
    }
}