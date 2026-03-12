package br.senai.ds2026.javafundamentos.aula01_console.Atividade2;

import java.util.Scanner;

public class Exemplo1AvaliacaoFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE AVALIAÇÃO DE FUNCIONÁRIO ===");

        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Pontuação de desempenho (0 a 100): ");
        int pontuacao = scanner.nextInt();

        System.out.print("Código do turno (1-Manhã | 2-Tarde | 3-Noite): ");
        int codigoTurno = scanner.nextInt();

        // Avaliação de desempenho com if/else
        String resultadoAvaliacao;
        if (pontuacao >= 70) {
            resultadoAvaliacao = "Aprovado na avaliação";
        } else {
            resultadoAvaliacao = "Necessita de melhoria";
        }

        // Identificação do turno com switch
        String turno;
        switch (codigoTurno) {
            case 1:
                turno = "Manhã";
                break;
            case 2:
                turno = "Tarde";
                break;
            case 3:
                turno = "Noite";
                break;
            default:
                turno = "Turno inválido";
                break;
        }

        // Saída organizada
        System.out.println("\n=== RESULTADO DA AVALIAÇÃO ===");
        System.out.println("Funcionário: " + nome);
        System.out.println("Cargo:      " + cargo);
        System.out.println("Pontuação:  " + pontuacao);
        System.out.println("Resultado da avaliação: " + resultadoAvaliacao);
        System.out.println("Turno de trabalho:       " + turno);

        scanner.close();
    }
}