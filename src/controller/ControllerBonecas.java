package controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ControllerBonecas {
	
	private static Scanner sc = new Scanner(System.in);
    private static List<String> bonecasCadastradas = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        while (true) {
            System.out.println("## Gerenciamento de Bonecas ##");
            System.out.println("1 - Cadastrar nova boneca");
            System.out.println("2 - Listar bonecas cadastradas");
            System.out.println("3 - Atualizar compra");
            System.out.println("4 - Cancelar compra");
            System.out.print("Digite a opção desejada: ");

            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Escolha inválida! Digite um número de acordo com o menu.");
                sc.nextLine();
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    cadastrarCompra();
                    break;
                case 2:
                    listarBonecas();
                    break;
                case 3:
                    atualizarCompra();
                    break;
                case 4:
                    System.out.println("Que pena, espero que volte logo!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void cadastrarCompra() {
        System.out.print("Digite o nome da boneca: ");
        String nomeBoneca = sc.next();
        bonecasCadastradas.add(nomeBoneca);
        System.out.println("Boneca cadastrada com sucesso!");
    }

    private static void listarBonecas() {
        System.out.println("Bonecas cadastradas:");
        for (String boneca : bonecasCadastradas) {
            System.out.println(boneca);
        }
    }

    private static void atualizarCompra() {
        System.out.println("Funcionalidade de atualização de compra em desenvolvimento.");
    }
}


