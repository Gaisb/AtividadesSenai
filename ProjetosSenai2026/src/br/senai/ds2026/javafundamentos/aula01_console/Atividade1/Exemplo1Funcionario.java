package br.senai.ds2026.javafundamentos.aula01_console.Atividade1;

import java.util.Scanner;

public class Exemplo1Funcionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE REGISTRO DE FUNCIONÁRIO ===");
        System.out.println("Digite as informações solicitadas abaixo.\n");

        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Salário mensal: ");
        double salarioMensal = scanner.nextDouble();

        System.out.print("Horas trabalhadas por dia: ");
        int horasDia = scanner.nextInt();

        // Cálculos
        double salarioAnual = salarioMensal * 12;
        double salarioDia = salarioMensal / 22;          // considerando ~22 dias úteis
        double valorHora = salarioDia / horasDia;

        // Saída organizada
        System.out.println("\n=== RESUMO DO FUNCIONÁRIO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);

        System.out.println("\n=== INFORMAÇÕES SALARIAIS ===");
        System.out.printf("Salário mensal: R$ %.2f%n", salarioMensal);
        System.out.printf("Salário anual:   R$ %.2f%n", salarioAnual);
        System.out.printf("Valor aproximado por dia:  R$ %.2f%n", salarioDia);
        System.out.printf("Valor aproximado por hora: R$ %.2f%n", valorHora);

        scanner.close();
    }
}