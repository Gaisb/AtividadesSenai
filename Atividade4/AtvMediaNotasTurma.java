package br.senai.ds2026.javafundamentos.aula01_console.Atividade4;

import java.util.Scanner;

public class AtvMediaNotasTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CÁLCULO DE MÉDIA DA TURMA ===");
        System.out.print("Informe a quantidade de alunos da turma: ");
        int quantidadeAlunos = scanner.nextInt();

        if (quantidadeAlunos <= 0) {
            System.out.println("Quantidade de alunos inválida!");
            scanner.close();
            return;
        }

        double somaNotas = 0.0;

        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.printf("Informe a nota do aluno %d: ", i);
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / quantidadeAlunos;

        System.out.println("\n=== RESULTADO ===");
        System.out.println("Quantidade de alunos avaliados: " + quantidadeAlunos);
        System.out.printf("Soma total das notas: %.2f%n", somaNotas);
        System.out.printf("Média geral da turma: %.2f%n", media);

        scanner.close();
    }
}