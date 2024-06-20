package menu;

import java.util.InputMismatchException;
import java.util.Scanner;
import cores.menu.CoresMenu;

public class Menu {
	
	public static Scanner sc = new Scanner(System.in);
	private static String boneca;


	public static void main(String[] args) {
		// Gerenciamento do estoque brand girls power
		
		int opcao;
		while (true) {
			//cores usardas  TEXT_GREEN = "\u001B[32m"; ANSI_PURPLE_BACKGROUND = "\u001B[45m"
			System.out.println(CoresMenu.TEXT_GREEN + CoresMenu.ANSI_PURPLE_BACKGROUND);

			System.out.println("                                                     ");
			System.out.println("                Bonecas The Powerpuff Girls          ");
			System.out.println("                                                     ");
			System.out.println("-----------------------------------------------------");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar nova boneca                ");
			System.out.println("            2 - Listar opções de bonecas             ");
			System.out.println("            3 - Atualizar compra                     ");
			System.out.println("            4 - Excluir compra                      ");
			System.out.println("                                                     ");
			System.out.println("-----------------------------------------------------");
			System.out.println("Digite a opção desejada:                             ");
			System.out.println("                                                     " + CoresMenu.TEXT_RESET);

			//Ótima escolha aproveite a compra da sua boneca preferida 
			try {
				opcao = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Escolha inválida! Por favor digite um número de acordo com o menu");
				sc.nextLine();
				opcao = 0;
			}

			
		switch (opcao) {
		case 1:
			System.out.println(CoresMenu.TEXT_GREEN  + "Cadasto para compra \n");
            cadastrarCompra();
			break;
		case 2:
			System.out.println(CoresMenu.TEXT_GREEN + "Listar opções de compra: \n");
			listarBonecas();
            break;
		
			
		case 3:
			System.out.println(CoresMenu.TEXT_GREEN + "Atualizar compra: \n");
			  atualizarCompra();
  
		case 4:
			System.out.println(CoresMenu.TEXT_GREEN + "Que pena, espero que volte logo!");
			sobre();
			sc.close();
			System.exit(0);
			
			default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
		}}
    }


private static void cadastrarCompra() {
    // Implemente a lógica para cadastrar uma nova boneca
    System.out.println("Opção Novo Cadastro Selecionado");
}

private static void listarBonecas() {
    // Implemente a lógica para listar as bonecas cadastradas
    System.out.println("Opção Listar bonecas cadastradas selecionada");
}

private static void atualizarCompra() {
    // Implemente a lógica para atualizar a compra
    System.out.println("Opção Atualizar compra selecionada");
}

public static void sobre() {
	System.out.println("Todos os direitos reservados a cartoon network.");}}
