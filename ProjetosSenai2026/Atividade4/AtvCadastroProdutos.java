package br.senai.ds2026.javafundamentos.aula01_console.Atividade4;

import java.util.Scanner;

public class AtvCadastroProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalProdutos = 0;
        char continuar;

        System.out.println("=== SISTEMA DE CADASTRO DE PRODUTOS ===");

        do {
            System.out.println("\nCadastro do produto #" + (totalProdutos + 1));
            System.out.print("Nome do produto: ");
            scanner.nextLine(); // limpa buffer
            String nome = scanner.nextLine();

            System.out.print("Preço do produto: R$ ");
            double preco = scanner.nextDouble();

            System.out.print("Quantidade em estoque: ");
            int quantidade = scanner.nextInt();

            totalProdutos++;

            System.out.print("\nDeseja cadastrar outro produto? (S/N): ");
            continuar = scanner.next().charAt(0);
            scanner.nextLine(); // limpa buffer para próxima iteração

        } while (continuar == 'S' || continuar == 's');

        System.out.println("\n=== RESUMO DO CADASTRO ===");
        System.out.println("Quantidade total de produtos cadastrados: " + totalProdutos);
        System.out.println("Fim do cadastro.");

        scanner.close();
    }
}
