package br.senai.ds2026.javafundamentos.aula01_console.Atividade1;

import java.util.Scanner;

public class Exemplo3RegistroDeAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== REGISTRO DE ALUNO ===\n");

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Curso: ");
        String curso = scanner.nextLine();

        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2 + nota3) / 3;

        // Saída formatada
        System.out.println("\n=== RESULTADO DO ALUNO ===\n");

        System.out.println("Aluno: " + nome);
        System.out.println("Curso: " + curso);

        System.out.println("\nNotas:");
        System.out.printf("Nota 1: %.1f%n", nota1);
        System.out.printf("Nota 2: %.1f%n", nota2);
        System.out.printf("Nota 3: %.1f%n", nota3);

        System.out.printf("%nMédia final: %.2f%n", media);

        scanner.close();
    }
}